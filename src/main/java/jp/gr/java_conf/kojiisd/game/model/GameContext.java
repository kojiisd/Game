package jp.gr.java_conf.kojiisd.game.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ゲーム全体の状態、条件を管理するクラス。
 * 
 * @author ishida
 * 
 */
public class GameContext {

	/** ノーマル状態 */
	public static int GAME_MODE_NORMAL = 0;

	/** デバッグ状態 */
	public static int GAME_MODE_DEBUG = 1;

	/** ゲームモード　0:normal 1:debug */
	private int gameMode = 0;

	/** 敵情報をキーと一緒に持つMap（フィールド名をキーとするなどしてそのマップごとの敵のリストを持つ） */
	private Map<String, List<Integer>> enemyListMap = new HashMap<String, List<Integer>>();;

	/**
	 * デフォルトコンストラクタ。
	 */
	public GameContext() {
	}

	/**
	 * コンストラクタ。
	 * 
	 * @param gameMode ゲームモード
	 */
	public GameContext(int gameMode) {
		this.gameMode = gameMode;

	}

	/**
	 * 初期化処理。
	 */
	private void init() {
		// TODO:キーごとの敵の作成をファイルから読み込む形式で行う。（YamlのBin形式）
	}

	/**
	 * @return the gameMode
	 */
	public int getGameMode() {
		return gameMode;
	}

	/**
	 * @param gameMode the gameMode to set
	 */
	public void setGameMode(int gameMode) {
		this.gameMode = gameMode;
	}

}
