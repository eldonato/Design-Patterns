package model;

public class EnchantedMazeFactory extends MazeFactory{

	public Room buildRoom() {
		Room er = new EnchantedRoom();
		return er;
	}

	public Door buildDoor() {
		Door ed = new EnchantedDoor();
		return ed;
	}

	public Wall buildWall() {
		Wall ew = new EnchantedWall();
		return ew;
	}

	public Maze buildMaze() {
		return new Maze(new EnchantedRoom(), new EnchantedDoor(), new EnchantedWall());
	}
}
