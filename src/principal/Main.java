package principal;

import model.MazeGame;
import consts.Consts;

public class Main {

	public static void main(String[] args) {
		MazeGame mg = new MazeGame(Consts.NORMAL);
		System.out.println(mg.createMaze());
		
		MazeGame mg2 = new MazeGame(Consts.ENCHANTED);
		System.out.println(mg2.createMaze());
	}

}
