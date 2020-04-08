package abstracts;

public abstract class AbstractMazeFactory {
	public AbstractMazeFactory() {};
	public abstract String makeMaze();
	public abstract String makeWall();
	public abstract String makeRoom();
	public abstract String makeDoor();
}
