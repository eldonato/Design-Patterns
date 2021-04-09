package model;

public abstract class MazeFactory {
	
	public MazeFactory() {}
	
	public abstract Room buildRoom();
	
	public abstract Door buildDoor();
	
	public abstract Wall buildWall();
	
	public abstract Maze buildMaze();	

}
