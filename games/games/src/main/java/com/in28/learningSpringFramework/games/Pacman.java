package com.in28.learningSpringFramework.games;

public class Pacman implements GameConsole{

	@Override
	public void up() {
		System.out.println("Up P");
		
	}

	@Override
	public void down() {
		System.out.println("Down P");
		
	}

	@Override
	public void left() {
		System.out.println("left P");
		
	}

	@Override
	public void right() {
		System.out.println("right P");
		
	}
	

}
