/**
 * 
 */
package org.game.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.game.exception.GameException;
import org.game.model.GameContext;
import org.game.util.MessageUtil;
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

		// 出現する敵の選定
		// TODO:DEBUGモードの時には自分で選べる
		List<Character> charaList = selectEnemy(this.gameContext_);

		// 現れた敵をビューに渡し敵キャラと戦闘画面を表示する。

		// ユーザの入力待ち状態にする。
		// GUIモードのことも考慮し、キー情報をすべてコントローラに返す。
		// 判断は全てこの処理で行い、何を選択するのか決定するまでループで繰り返す。

		// 先行／後攻を決める

		// 先行から攻撃を始め、HPが0にならない限り後攻も攻撃を行う。

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
	}

	/**
	 * 敵を選択する。（TODO:GUIを考慮し、キャラサイズの合計値が表示幅をはみ出ないように調整する。）
	 * 
	 * @param gameContext ゲームコンテキスト
	 * @return キャラリスト
	 */
	private List<Character> selectEnemy(GameContext gameContext) {
		if (gameContext == null) {
			throw new GameException(
					MessageUtil.getMessage("game.common.noContext"));
		}

		List<Character> charaList = new ArrayList<Character>();
		
		if (gameContext.getGameMode() == GameContext.GAME_MODE_DEBUG) {
			// TODO: 自分で敵キャラを選択するダイアログを出現させる。
		}

		return charaList;
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
