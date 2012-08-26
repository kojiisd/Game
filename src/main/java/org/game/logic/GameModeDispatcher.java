package org.game.logic;

import org.apache.log4j.Logger;
import org.game.model.GameContext;

/**
 * ゲームモードを割り振るディスパッチャ
 * 
 * @author ishida-note
 * 
 */
public class GameModeDispatcher {

	/** ロガー */
	private Logger log__ = Logger.getLogger(GameModeDispatcher.class);

	/**
	 * デフォルトコンストラクタ。
	 */
	public GameModeDispatcher() {
	}

	public void dispatch(GameContext gameContext) {

		if (gameContext == null) {
			System.err.println("ゲーム状態が指定されていません。中止します。");
			return;
		}

		int gameMode = gameContext.getGameMode();
		switch (gameMode) {
		case 0:
			break;
		case 1:
			break;
		default:
			break;
		}
	}
}
