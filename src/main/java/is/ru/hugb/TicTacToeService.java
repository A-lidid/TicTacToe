package is.ru.hugb;

import java.util.ArrayList;

public class TicTacToeService {
	/**
	* An instance of a TicTacToe game
	*/
	private TicTacToe ticTacToe = new TicTacToe();
	/**
	* The number of elapsed turns
	*/
	private int turnCount = 0;


	/**
	 * Initialize the game board.                           
	 * <p>
	 * Initialze the game board by setting each char in the 
	 * array to the number that position represents
	 */

	public void initialize() {
		turnCount = 0;
		ticTacToe.initializeGameboard();
	}

/**
	 * Insert a symbol onto the game board                         
	 * @return Returns true if the symbol was inserted and false otherwise
	 */

	public boolean insertSymbol(int number) {
		if(ticTacToe.insertSymbol(turnCount % 2 + 1, number)) {
			turnCount++;
			return true;
		}
		return false;
	}

	/**
	 * Function that returns the status of the game
	 * @return Returns 0 if the game is still going, 1 if player 1 has won,
	 *         2 if player two has won and 3 if the game has ended in a tie.
	 */

	public int isGameOver() {
		return ticTacToe.isGameOver();
	}
	/**
	* Function that returns an array representation of the game boards.
	* @return An array of strings each representing one square of the game board.
	*/
	public ArrayList<String> getArray() {
		return ticTacToe.getArray();
	}
}