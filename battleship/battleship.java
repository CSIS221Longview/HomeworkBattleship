package battleship;
/* 
* ************************
* CSIS 222 Class 2016 fall
* Author :Charles Githongo
* **************************
Battleship program. It is a game composed of 5 ships and one is trying to sink all the ships
This main program is calling the actiongame.java which an object
*/

//import battleshipGroup.actiongame;

public class battleship {

	public static void main(String[] args) {
		
		actiongame game = new actiongame();
		game.beginGame();
		
		}

}
