package jp.gr.java_conf.kojiisd.game.view;

public interface GameViewer {
	
	/**
	 * オープニングの描画。
	 */
	public void drawOpening();

	/**
	 * タイトルの描画。
	 */
	public void drawTitle();

	/**
	 * タイトルメニューの描画。
	 */
	public void drawTitleMenu();

	/**
	 * メニューの描画。
	 */
	public void drawMenu();

	/**
	 * メッセージの描画。
	 */
	public void drawMessage();

	/**
	 * フィールドの描画。
	 */
	public void drawField();

	/**
	 * キャラクタアニメーションの描画。
	 */
	public void drawCharaAnimation();
}
