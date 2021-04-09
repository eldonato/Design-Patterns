package model;

public class EnchantedMaze extends Maze{
	
	private Room EnchantedRoom;
	private Door EnchantedWall;
	private Wall EnchantedDoor;
	
	public EnchantedMaze(Room enchantedRoom, Door enchantedWall, Wall enchantedDoor) {
		EnchantedRoom = enchantedRoom;
		EnchantedWall = enchantedWall;
		EnchantedDoor = enchantedDoor;
	}

	public Room getEnchantedRoom() {
		return EnchantedRoom;
	}

	public void setEnchantedRoom(Room enchantedRoom) {
		EnchantedRoom = enchantedRoom;
	}

	public Door getEnchantedWall() {
		return EnchantedWall;
	}

	public void setEnchantedWall(Door enchantedWall) {
		EnchantedWall = enchantedWall;
	}

	public Wall getEnchantedDoor() {
		return EnchantedDoor;
	}

	public void setEnchantedDoor(Wall enchantedDoor) {
		EnchantedDoor = enchantedDoor;
	}

	public String toString() {
		return "EnchantedMaze [EnchantedRoom=" + EnchantedRoom + ", EnchantedWall=" + EnchantedWall + ", EnchantedDoor="
				+ EnchantedDoor + "]";
	}
	
}
