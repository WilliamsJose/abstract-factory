package model;

import abstracts.AbstractMazeFactory;

public class EnchantedMazeFactory extends AbstractMazeFactory {

	public EnchantedMazeFactory(){};
	
	public EnchantedRoom getInstance() {
		return new EnchantedRoom();
	}

	@Override
	public String makeMaze() {
		return "Building enchanted Maze";
	}

	@Override
	public String makeWall() {
		return "Building enchanted Wall";
	}

	@Override
	public String makeRoom() {
		return "Building enchanted Room";
	}

	@Override
	public String makeDoor() {
		return "Building enchanted Door";
	}	
}
