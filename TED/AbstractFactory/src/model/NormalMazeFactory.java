package model;

public class NormalMazeFactory extends MazeFactory{

	@Override
	public Room buildRoom() {
		Room nr = new NormalRoom();
		return nr;
	}

	@Override
	public Door buildDoor() {
		Door nd = new NormalDoor();
		return nd;	
	}

	@Override
	public Wall buildWall() {
		Wall nw = new NormalWall();
		return nw;
	}

	@Override
	public Maze buildMaze() {
		return new Maze(new NormalRoom(), new NormalDoor(), new NormalWall());
	}
}
