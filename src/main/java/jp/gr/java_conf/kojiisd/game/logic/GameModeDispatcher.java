package jp.gr.java_conf.kojiisd.game.logic;

import jp.gr.java_conf.kojiisd.game.model.GameContext;

import org.apache.log4j.Logger;

/**
 * ゲームモードを割り振るディスパッチャ
 * 
 * @author kojiisd
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

	/**
	 * ゲームコンテキストによって処理を振り分ける。
	 * 
	 * @param gameContext ゲームコンテキスト
	 */
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
