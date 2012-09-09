package jp.gr.java_conf.kojiisd.game.view;

public class GameConsoleViewer implements GameViewer {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void drawOpening() {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void drawTitle() {
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■　　　　Game　for Console Ver　　　　　　■■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void drawTitleMenu() {
		System.out.println("1.Start New Game");
		System.out.println("2.Continue");
		System.out.println("3.Config");
		System.out.println("4.Exit");
		System.out.print("Number? : ");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void drawMenu() {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void drawMessage() {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void drawField() {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void drawCharaAnimation() {
		// TODO Auto-generated method stub

	}

}
