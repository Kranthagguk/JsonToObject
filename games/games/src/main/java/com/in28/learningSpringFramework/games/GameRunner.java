package com.in28.learningSpringFramework.games;

public class GameRunner {

	private GameConsole game;
	
	public GameRunner(GameConsole game) {
		this.game = game;
		
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game"+ game);
		game.down();
		game.left();
	}
}
