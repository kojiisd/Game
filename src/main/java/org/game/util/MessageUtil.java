/**
 * 
 */
package org.game.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

/**
 * @author ishida
 * 
 */
public class MessageUtil {

	/** ファイルのプレフィックス */
	private static final String FILE_PREFIX = "Messages";

	/** プロパティファイルオブジェクト */
	private static Properties prop = new Properties();

	/**
	 * インスタンス化を禁止するコンストラクタ。
	 */
	private MessageUtil() {
		// do nothing.
	}

	static {
		try {
			prop.load(new FileInputStream(FILE_PREFIX + ".properties"));
		} catch (FileNotFoundException ex) {
			System.err.println("ファイルの読み込みに失敗しました。起動処理を終了します。");
			ex.printStackTrace();
		} catch (IOException ex) {
			System.err.println("ファイル読み込み中に予期せぬエラーが発生しました。起動処理を終了します。");
			ex.printStackTrace();
		}
	}

	/**
	 * キー情報を基に、プロパティファイルからメッセージを取得する。
	 * 
	 * @param key キー
	 * @return メッセージ
	 */
	public static String getMessage(String key) {
		String result = "";

		if (StringUtils.isBlank(key)) {
			return result;
		}

		result = prop.getProperty(key);

		return result;
	}

	/**
	 * メッセージ引数を持つ場合のメッセージ取得メソッド。
	 * 
	 * @param key キー
	 * @param args 引数（可変長）
	 * @return メッセージ
	 */
	public static String getMessage(String key, String... args) {
		String result = "";

		String tmpResult = getMessage(key);
		result = MessageFormat.format(tmpResult, new Object[] { args });

		return result;
	}
}
