package model;

public class Maze {
	
	private Room room;
	private Door door;
	private Wall wall;
	
	public Maze(Room room, Door door, Wall wall) {
		this.room = room;
		this.door = door;
		this.wall = wall;
	}
	
	public Maze() {}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Door getDoor() {
		return door;
	}

	public void setDoor(Door door) {
		this.door = door;
	}

	public Wall getWall() {
		return wall;
	}

	public void setWall(Wall wall) {
		this.wall = wall;
	}

	public String toString() {
		return "Maze [room=" + room + ", door=" + door + ", wall=" + wall + "]";
	}
	
}
