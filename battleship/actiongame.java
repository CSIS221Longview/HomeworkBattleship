package battleship;

import java.util.Scanner;

// The actiongame.java calls the gameboard.java
public class actiongame {
	
	Scanner input = new Scanner(System.in);
	gameboard gameboard;
	
	

	int length, size, missles, hits, turns;
	
		
	public  void beginGame(){
		boolean quit = false;

		
		// runs the battleship menu which is the first screen to appear
		do {
			battle_Level();
			

			quit = getUserChoice();
			gameboard.showBoard();
			

		} while (!quit); // end of do --- while -- battleMenu ----
	}

	public  boolean getUserChoice() {
		Scanner in = new Scanner(System.in);
		boolean quit = false;

		int userChoice = 0;

		userChoice = in.nextInt();

		if (userChoice == 1) {
			// beginnerLevel(){
			missles = 30;
			gameboard = new gameboard(6);
			
		} else if (userChoice == 2) {

			// standardLevel();
			missles = 50;
			gameboard = new gameboard(9);
			
		} else if (userChoice == 3) {
			// advanceLevel();

			missles = 75;
			gameboard = new gameboard(12);
			
	} else if (userChoice == 0) {

		quit = true;
		System.out.println();
		System.out.println("*************************");
		System.out.println("Bye ! thanks for trying ");
		System.out.println("************************");

	} else {
		System.out.println("You entered an Invalid choice, please check and try again");
		System.out.println("*********************************************************");
	}

	return quit;

}

	// battle level
	public static void battle_Level() {
		boolean quit = false;
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("Welcome to the Battleship Game");
		System.out.println("------------------------------");
		//System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("*******Choose Your level to play ********");
		System.out.println("-----------------------------------------");

		System.out.println("1. Beginner Level");

		System.out.println("2. Standard Level ");

		System.out.println("3. Advanced Level");

		System.out.println();

		System.out.print("Your choice, 0 to quit: ");

		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("select 1 - 3 from the menu: ");
		System.out.println("---------------------------------------");

	}
		
		
	}
	

	
	
	
	
	


