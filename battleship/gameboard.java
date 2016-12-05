package battleship;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class gameboard {
	private ship [] ships;
	public static final int OUT_OF_BOUNDS = -1;
	private String[][] board;
	// values in the 2D grid
	public static final int EMPTY = 0;
	public static final int SHIP = 1;
	public static final String HIT = "H";
	public static final String MISS = "M";

	// shape placement directions
	private static final int DIRECTION_HORIZONTAL = 0;
	private static final int DIRECTION_VERTICAL = 1;

	// various ships lengths in the game
	private static final int AIRCRAFT_LEN = 5;
	private static final int BATTLESHIP_LEN = 4;
	private static final int DESTROYER_LEN = 3;
	private static final int SUBMARINE_LEN = 3;
	private static final int PATROL_BOAT_LEN = 2;

	// Array of ship lengths
	private static final int[] SHIP_LEN = { AIRCRAFT_LEN, BATTLESHIP_LEN, DESTROYER_LEN, SUBMARINE_LEN,
			PATROL_BOAT_LEN };

	Scanner input = new Scanner(System.in);
	
	 gameboard(int size){
		 board = new String [size][size];
		 
	 };

	 private class ship {
			public String name = "";
			public String type = "";
			public int size = 0;
			
			public ship(String name, String type, int size) {
				this.name = name;
				this.type = type;
				this.size = size;
			}
			
	}
	private void CreateShips(){
		ships = new ship[5];
		ships[0] = new ship ("Aircraft","AIRFORCE", 5);
		ships[1] = new ship ("Battle","WARLORD", 4);
		ships[2] = new ship ("Destroyer","DESTROY", 3);
		ships[3] = new ship ("Submarine","SEAKING", 5);
		ships[4] = new ship ("Patrol","PATROL", 2);
	}

	private void placeShips(){
		for (int i = 0; i < 4; i++){
			
			ship ship = ships[i];
		}
		
	}
	public  void showBoard() {

		for (int r = 0; r < board.length; r++) {
			//if (DEBUG == true) {
				for (int c = 0; c < board[0].length; c++) {
					System.out.print(board[r][c]);
				}
				System.out.println("");
			
			}
		}

	

	

}
