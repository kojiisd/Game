package org.game.view;

public class GameConsoleViewer implements GameViewer{

	@Override
	public void drawOpening() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawTitle() {
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■　　　　Game　for Console Ver　　　　　　■■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}

	@Override
	public void drawTitleMenu() {
		System.out.println("1.Start New Game");
		System.out.println("2.Continue");
		System.out.println("3.Config");
		System.out.println("4.Exit");
		System.out.print("Number? : ");
	}

	@Override
	public void drawMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawField() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawCharaAnimation() {
		// TODO Auto-generated method stub
		
	}

}
