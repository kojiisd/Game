package jp.gr.java_conf.kojiisd.game.main;

import java.util.HashMap;
import java.util.Map;

import jp.gr.java_conf.kojiisd.game.exception.GameException;
import jp.gr.java_conf.kojiisd.game.logic.GameModeDispatcher;
import jp.gr.java_conf.kojiisd.game.model.GameContext;
import jp.gr.java_conf.kojiisd.game.util.LoggerUtil;
import jp.gr.java_conf.kojiisd.game.util.MessageUtil;
import jp.gr.java_conf.kojiisd.game.view.GameConsoleViewer;
import jp.gr.java_conf.kojiisd.game.view.GameGuiViewer;
import jp.gr.java_conf.kojiisd.game.view.GameViewer;

import org.apache.log4j.Logger;

/**
 * メインクラス。
 * 
 * @author ishida
 * 
 */
public class Main {

	/** ゲームモード（GUI） */
	private static String MODE_GUI = "-gui:on";

	/** ロガー */
	private static Logger log__ = LoggerUtil.getLogger(Main.class);

	/** ゲームコンテキスト */
	private GameContext gameContext_ = null;

	/** ディスパッチャ */
	private GameModeDispatcher gameModeDispatcher = new GameModeDispatcher();

	/** ゲームの表示をどうするのか選択するためのMap */
	private Map<String, GameViewer> viewerMap = new HashMap<String, GameViewer>();

	public Main() {
		this.viewerMap.put("gui", new GameGuiViewer());
		this.viewerMap.put("console", new GameConsoleViewer());

		this.gameContext_ = new GameContext();
		this.gameModeDispatcher = new GameModeDispatcher();
	}

	/**
	 * メインメソッド。ゲームのメインの流れを司る。
	 * 
	 * @param args 起動引数
	 */
	public static void main(String[] args) {
		log__.info(MessageUtil.getMessage("game.common.start"));
		try {
			Main main = new Main();
			main.start(args);
		} catch (GameException gex) {
			log__.error(gex.getMessage());
			log__.info(MessageUtil.getMessage("game.common.end"));
		} catch (Throwable th) {
			log__.error(th.getMessage());
			log__.info(MessageUtil.getMessage("game.common.end"));
		}
	}

	/**
	 * ゲームを開始する。
	 * 
	 * @param args 起動引数
	 * @throws GameException 共通例外
	 */
	private void start(String[] args) throws GameException {
		// 引数なしはコンソールアプリとして起動する。
		// 引数が-gui:onの場合は、GUIモードとして起動する。
		// 起動時にデバッグモードかどうかの判定を行う。

		if (args == null || args.length == 0) {
			throw new GameException(MessageUtil.getMessage("game.common.usage"));
		}

		int gameMode = 0;
		if (args.length == 2) {
			int tempGameMode = 0;
			try {
				tempGameMode = Integer.valueOf(args[1]);
			} catch (NumberFormatException nfex) {
				throw new GameException(
						MessageUtil.getMessage("gaem.common.usage"), nfex);
			}

			gameMode = tempGameMode;
		}

		if (gameMode != GameContext.GAME_MODE_NORMAL) {
			this.gameContext_ = new GameContext(GameContext.GAME_MODE_DEBUG);
		} else {
			this.gameContext_ = new GameContext();
		}
	}
}
