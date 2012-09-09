/**
 * 
 */
package jp.gr.java_conf.kojiisd.game.logic;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import jp.gr.java_conf.kojiisd.game.exception.GameCommonException;
import jp.gr.java_conf.kojiisd.game.model.CharacterDto;
import jp.gr.java_conf.kojiisd.game.model.GameContext;
import jp.gr.java_conf.kojiisd.game.util.LoggerUtil;
import jp.gr.java_conf.kojiisd.game.util.MessageUtil;
import jp.gr.java_conf.kojiisd.game.view.GameViewer;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

public class ConsoleController implements GameController {

	/** ロガー */
	private static Logger log__ = LoggerUtil.getLogger(ConsoleController.class);

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
		List<CharacterDto> charaList = selectEnemy(this.gameContext_);

		// 現れた敵をビューに渡し敵キャラと戦闘画面を表示する。
		if (this.gameContext_.getGameMode() == GameContext.GAME_MODE_DEBUG) {
			// ダイアログからカンマ区切りで敵のIDを割り振る
		} else {
			// 通常はマップと敵キャラのサイズから出現敵キャラと出現数を決定する。
		}

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
	 * @throws GameCommonException 共通例外
	 */
	public void changeMode(int gameMode) throws GameCommonException {
		if (this.gameContext_ == null) {
			throw new GameCommonException("game.common.noContext");
		}

		this.gameContext_.setGameMode(gameMode);
	}

	/**
	 * 敵を選択する。（TODO:GUIを考慮し、キャラサイズの合計値が表示幅をはみ出ないように調整する。）
	 * 
	 * @param gameContext ゲームコンテキスト
	 * @return キャラリスト
	 */
	private List<CharacterDto> selectEnemy(GameContext gameContext) {
		if (gameContext == null) {
			throw new GameCommonException(
					MessageUtil.getMessage("game.common.noContext"));
		}

		List<CharacterDto> charaList = new ArrayList<CharacterDto>();
		String[] enemyIdStrArray = null;

		if (gameContext.getGameMode() == GameContext.GAME_MODE_DEBUG) {
			// TODO: 自分で敵キャラを選択するダイアログを出現させる。
			enemyIdStrArray = selectEnemyIdArraytForDebug();
		} else {
			// TODO: 敵キャラを条件を考慮して（サイズ、マップ、出現数）出現させる。
		}

		return charaList;
	}

	/**
	 * 条件を考慮して、敵IDを指定する。
	 * 
	 * @param gameContext ゲームコンテキスト
	 * @return 敵IDの文字列配列
	 */
	private String[] selectEnemyIdArray(GameContext gameContext) {
		// gameContextのnullチェックは事前にされているため不要。

		// TODO: 実装
		return new String[] { "1", "2", "3" };

	}

	/**
	 * 敵IDの指定をダイアログから取得する。（デバッグ用）
	 * 
	 * @return 敵IDの文字列配列
	 */
	private String[] selectEnemyIdArraytForDebug() {
		String resultStr = JOptionPane.showInputDialog("敵キャラIDをカンマ区切りで指定すること。");
		if (StringUtils.isBlank(resultStr)) {
			return null;
		}
		String[] resultStrArray = resultStr.split(",");

		return resultStrArray;
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
