/**
 * 
 */
package org.game.controller;

import org.apache.log4j.Logger;
import org.game.exception.GameException;
import org.game.model.GameContext;
import org.game.view.GameViewer;

/**
 * @author ishida
 * 
 */
public class ConsoleController implements GameController {

	/** ロガー */
	private static Logger log__ = Logger.getLogger(ConsoleController.class);

	/** ゲームコンテキスト */
	private GameContext gameContext_;

	/** ゲーム表示用インスタンス */
	private GameViewer gameViewer_;

	/**
	 * コンストラクタ。
	 * 
	 * @param gameContext ゲームコンテキスト
	 */
	public ConsoleController(GameContext gameContext, GameViewer gameViewer) {
		this.gameContext_ = gameContext;
		this.gameViewer_ = gameViewer;
	}

	/**
	 * 戦闘を開始する。
	 */
	public void startBattle() {
		log__.info("game.battle.start");

		log__.info("game.baggle.end");

	}

	/**
	 * 指定されたゲームモードに切り替える。
	 * 
	 * @param gameMode
	 * @throws GameException 共通例外
	 */
	public void changeMode(int gameMode) throws GameException {
		if (this.gameContext_ == null) {
			throw new GameException("game.common.noContext");
		}

		this.gameContext_.setGameMode(gameMode);
		// TODO: ログ出力
	}

	/**
	 * ゲームコンテキストを設定する。
	 * 
	 * @param gameContext ゲームコンテキスト
	 */
	public void setGameContext(GameContext gameContext) {
		this.gameContext_ = gameContext;
	}
}
