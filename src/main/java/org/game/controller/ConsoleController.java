/**
 * 
 */
package org.game.controller;

import org.game.model.GameContext;

/**
 * @author ishida
 *
 */
public class ConsoleController implements GameController {
	
	/** ゲームコンテキスト */
	private GameContext gameContext_;
	
	/**
	 * コンストラクタ。
	 * @param gameContext ゲームコンテキスト
	 */
	public ConsoleController(GameContext gameContext) {
		this.gameContext_ = gameContext;
	}
	
	/**
	 * 指定されたゲームモードに切り替える。
	 * @param gameMode
	 */
	public void changeMode (int gameMode) {
		if (this.gameContext_ == null) {
			// TODO: 例外処理
			return;
		}
		
		this.gameContext_.setGameMode(gameMode);
		// TODO: ログ出力
	}
	
	/**
	 * ゲームコンテキストを設定する。
	 * @param gameContext ゲームコンテキスト
	 */
	public void setGameContext(GameContext gameContext) {
		this.gameContext_ = gameContext;
	}
}
