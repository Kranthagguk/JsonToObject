package com.in28.learningSpringFramework;

import com.in28.learningSpringFramework.games.Contra;
import com.in28.learningSpringFramework.games.MarioGame;
import com.in28.learningSpringFramework.games.Pacman;
import com.in28.learningSpringFramework.games.GameRunner;

public class App01GamingbasicsJava {

	public static void main(String[] args) {
		
		MarioGame mario= new MarioGame();
		Contra contra = new Contra();
		Pacman pacman= new Pacman();
		GameRunner gamerunner= new GameRunner(pacman);
		gamerunner.run();
	}

}
