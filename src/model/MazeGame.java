package model;

import consts.Consts;

public class MazeGame {
	private String tipo;
	private String maze;
	private String room;
	private String wall;
	private String door;
	
	public MazeGame() {};
	
	public MazeGame(String tipo) {
		this.setTipo(tipo);
	}

	public String createMaze() {
		if(this.tipo.equals(Consts.NORMAL)) {
			MazeFactory mf = new MazeFactory();
			this.maze = mf.makeMaze();
			this.room = mf.makeRoom();
			this.wall = mf.makeWall();
			this.door = mf.makeDoor();
			return toString();
		} else if(this.tipo.equals(Consts.ENCHANTED)) {
			EnchantedMazeFactory emf = new EnchantedMazeFactory();
			this.maze = emf.makeMaze();
			this.room = emf.makeRoom();
			this.wall = emf.makeWall();
			this.door = emf.makeDoor();
			return toString();
		}
		
		return "Default";
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "\n MazeGame [tipo=" + this.tipo 
				+ "\n maze=" + this.maze 
				+ "\n room=" + this.room 
				+ "\n wall=" + this.wall 
				+ "\n door=" + this.door
				+ "]";
	}
}
