package is.ru.hugb;
import java.util.ArrayList;

/**
 * @author      Arnar  
 */
public class TicTacToe {
	/**
	* A 3x3 array of characters that keeps track of the state of the board.
	*/
	private char[][] gameBoard;
	/**
	* The length of the game board.
	*/
	private final int BOARDSIZE = 3;
	/**
	* A constant to indicate the game is still ongoing.
	*/
	private final int GAMENOTOVER = 0;
	/**
	* A constant to indicate the game has ended in a tie.
	*/
	private final int GAMETIED = 3;
	/**
	* A constant to represent player one.
	*/
	private final int PLAYERONE = 1;
	/**
	* A constant to represent player two.
	*/
	private final int PLAYERTWO = 2;
	/**
	* A constant to represent player one's symbol.
	*/
	private final char PLAYERONESYMBOL = 'x';
	/**
	* A constant to represent player two's symbol.
	*/
	private final char PLAYERTWOSYMBOL = 'o';

	/**
	* A Tic Tac Toe Game                   
	*/
	public TicTacToe() {

		gameBoard = new char[BOARDSIZE][BOARDSIZE];
		initializeGameboard();
	}

	public static void main(String[] args) {

	}

	/**
	 * Initialize the game board.                           
	 * <p>
	 * Initialze the game board by setting each char in the 
	 * array to the number that position represents
	 */
	public void initializeGameboard() {
		for (int row = 0; row < BOARDSIZE; row++) {
			for (int col = 0; col < BOARDSIZE; col++) {
				gameBoard[row][col] = Character.forDigit(row * 3 + col, 10);
			}
		}
	}

	/**
	 * Output a string representation of the game board.  	 
	 * @return A String representation of the board.
	 */
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int row = 0; row < BOARDSIZE; row++) {
			for (int col = 0; col < BOARDSIZE; col++) {
				builder.append(gameBoard[row][col]);
			}
			builder.append("\n");
		}
		return builder.toString();
	}

	/**
	 * Converts a onedimensional position to a two dimensional one.
	 *
	 * @param  position integer from 1-9 to convert to a gameBoard position.
	 * @return Returns a BoardCoords that contains a gameBoard position.
	 */
	private BoardCoords convertBoardPosition(int position) {
		int row = position / BOARDSIZE;
		int col = position % BOARDSIZE;
		return new BoardCoords(row, col);
	}

	/**
	 * Validates that a position is between 1 and 9.
	 * <p>
	 * Longer description. If there were any, it would be    
	 * here.
	 * <p>
	 * And even more explanations to follow in consecutive
	 * paragraphs separated by HTML paragraph breaks.
	 *
	 * @param  position Description text text text.          
	 * @return Returns true if 1 <= position <= 9.
	 */
	private boolean validatePosition(int position) {
		if (position > 9 || position < 1) {
			return false;
		}
		return true;
	}

	/**
	* Function that returns an array of the board positions                         
	* <p>
	*
	* @return Returns an ArrayList of the board positions
	*/
	public ArrayList<String> getArray() {
		ArrayList<String> board = new ArrayList<String>();
		for(int i = 0; i < BOARDSIZE; i++) {
			for(int j = 0; j < BOARDSIZE; j++) {
				if(gameBoard[i][j] != PLAYERONESYMBOL && gameBoard[i][j] != PLAYERTWOSYMBOL){
					board.add(Character.toString(gameBoard[i][j]));	
				}
				else {
					board.add(" ");
				}
			}
		}
		return board;
	}

	/**
	* Function that checks if the game is over                          
	* <p>
	* Function that checks either plays has 3 symbols in a row or the game
	* board is full
	*
	* @return Returns 0 if the game is still going, 1 if player one won,
	* 2 if player two won or 3 if the game is tied.
	*/
	public int isGameOver() {
		for (int i = 0; i < BOARDSIZE; i++) {
			if (gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][0] == gameBoard[i][2]) {
				return getPlayerFromSymbol(gameBoard[i][0]);
			}
		}
		for (int i = 0; i < BOARDSIZE; i++) {
			if (gameBoard[0][i] == gameBoard[1][i] && gameBoard[0][i] == gameBoard[2][i]) {
				return getPlayerFromSymbol(gameBoard[0][i]);
			}
		}
		if (gameBoard[0][0] == gameBoard[1][1] && gameBoard[0][0] == gameBoard[2][2]) {
			return getPlayerFromSymbol(gameBoard[0][0]);
		}
		if (gameBoard[0][2] == gameBoard[1][1] && gameBoard[0][2] == gameBoard[2][0]) {
			return getPlayerFromSymbol(gameBoard[0][2]);
		}
		int symbolCounter = 0;
		for (int i = 0; i < BOARDSIZE; i++) {
			for (int j = 0; j < BOARDSIZE; j++) {
				if (gameBoard[i][j] == PLAYERONESYMBOL || gameBoard[i][j] == PLAYERTWOSYMBOL) {
					symbolCounter++;
				}
			}
		}
		if (symbolCounter == 9) {
			return GAMETIED;
		}
		return GAMENOTOVER;
	}

	/**
	 * Function that returns the players symbol.                    
	 * @param  symbol the symbol of the player.          
	 * @return Returns 1 if symbol is player ones symbol, 2 otherwise.
	 */
	private int getPlayerFromSymbol(char symbol) {
		if (symbol == PLAYERONESYMBOL) {
			return PLAYERONE;
		}
		return PLAYERTWO;
	}

	/**
	 * Inserts a players symbol into the gameboard.         
	 * @param  position the board position to place the symbol         
	 * @param player theplayer whoes turn it is.
	 * @return returns true if the symbol is placed, false otherwise.
	 */
	public boolean insertSymbol(int player, int position) {
		if (validatePosition(position)) {
			BoardCoords coords = convertBoardPosition(position - 1);
			if (gameBoard[coords.row][coords.col] != PLAYERONESYMBOL
					&& gameBoard[coords.row][coords.col] != PLAYERTWOSYMBOL) {
				if (player == PLAYERTWO) {
					gameBoard[coords.row][coords.col] = PLAYERTWOSYMBOL;
				} 
				else {
					gameBoard[coords.row][coords.col] = PLAYERONESYMBOL;
				}
				return true;
			}
		}
		return false;
	}

	private class BoardCoords {
		private int row;
		private int col;

		BoardCoords(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}
}
