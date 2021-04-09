package vision;

import java.util.Scanner;

import model.EnchantedMazeFactory;
import model.Maze;
import model.MazeFactory;
import model.NormalMazeFactory;

public class App {
	
	private static Maze buildMaze(String mazeType) {
		MazeFactory mf = null;
		if (mazeType.equals("normal")) {
			mf = new NormalMazeFactory();
		}
		
		else if (mazeType.equals("enchanted")) {
			mf = new EnchantedMazeFactory();
		}
		
		Maze m = new Maze();
		m.setRoom(mf.buildRoom());
		m.setDoor(mf.buildDoor());
		m.setWall(mf.buildWall());
		
//		Maze m = mf.buildMaze();
		
		return m;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Which maze do you wanna build? (normal, enchanted) ");
		String mazeType = scan.next();
		System.out.println("");
		
		System.out.println("Building a " + mazeType + " maze...");
		
		Maze m = buildMaze(mazeType);
		
		
		scan.close();
	}
	

}
