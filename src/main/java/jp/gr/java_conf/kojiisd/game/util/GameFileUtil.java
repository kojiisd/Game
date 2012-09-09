/**
 * 
 */
package jp.gr.java_conf.kojiisd.game.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.apache.commons.lang3.StringUtils;

/**
 * ファイル操作に関する操作をまとめたクラス。
 * 
 * @author kojiisd
 * 
 */
public class GameFileUtil {

	/**
	 * インスタンス生成を禁止するためのデフォルトコンストラクタ。
	 */
	private GameFileUtil() {
		// do nothing.
	}

	/**
	 * シリアライズ化されたオブジェクトを出力しているファイルを読み込み、オブジェクトを返す。
	 * 
	 * @param filePath ファイルパス
	 * @return 読み込んだ結果のオブジェクト
	 * @throws IOException 読み込み例外
	 * @throws ClassNotFoundException クラス指定例外
	 */
	public static Object readObjectFile(String filePath) throws IOException,
			ClassNotFoundException {
		Object resultObj = null;

		if (StringUtils.isBlank(filePath)) {
			return resultObj;
		}

		FileInputStream inFile = null;
		ObjectInputStream inObject = null;
		try {
			inFile = new FileInputStream(new File(filePath));
			inObject = new ObjectInputStream(inFile);

			resultObj = inObject.readObject();
		} finally {
			if (inObject != null) {
				inObject.close();
			}
		}

		return resultObj;
	}
}
