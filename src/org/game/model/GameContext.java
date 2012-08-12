package org.game.model;

/**
 * ゲームの状態を管理するクラス。
 * 
 * @author ishida
 * 
 */
public class GameContext {

	/** ゲームモード　0:normal 1:debug */
	private int gameMode = 0;

	/**
	 * コンストラクタ
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
