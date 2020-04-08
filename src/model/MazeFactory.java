package model;

import abstracts.AbstractMazeFactory;

public class MazeFactory extends AbstractMazeFactory {
	
	public MazeFactory() {};
	
	public Room getInstance() {
		return new Room();
	}

	@Override
	public String makeMaze() {
		return "Building Maze";
	}

	@Override
	public String makeWall() {
		return "Building Wall";
	}

	@Override
	public String makeRoom() {
		return "Building Room";
	}

	@Override
	public String makeDoor() {
		return "Building Door";
	}
}
