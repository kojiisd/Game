package org.game.model;

/**
 * ゲームの状態、条件を管理するクラス。
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

	/**
	 * デフォルトコンストラクタ。
	 */
	public GameContext() {
		// do nothing
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
