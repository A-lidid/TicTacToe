package is.ru.hugb;

/**
 * @author      Firstname Lastname 
 * @version     1.6  (current version number of program)
 * @since       1.2 (the version of the package this class was first added to)
 */
public class TicTacToe {
	/**
	* Description of the variable here.
	*/
	private char[][] gameBoard;
	/**
	* Description of the variable here.
	*/
	private final int BOARDSIZE = 3;
	/**
	* Description of the variable here.
	*/
	private final int GAMENOTOVER = 0;
	/**
	* Description of the variable here.
	*/
	private final int GAMETIED = 3;
	/**
	* Description of the variable here.
	*/
	private final int PLAYERONE = 1;
	/**
	* Description of the variable here.
	*/
	private final int PLAYERTWO = 2;
	/**
	* Description of the variable here.
	*/
	private final char PLAYERONESYMBOL = 'x';
	/**
	* Description of the variable here.
	*/
	private final char PLAYERTWOSYMBOL = 'o';

	/**
	* Short one line description.                           (1)
	* <p>
	* Longer description. If there were any, it would be    (2)
	* here.
	* <p>
	* And even more explanations to follow in consecutive
	* paragraphs separated by HTML paragraph breaks.
	*/
	public TicTacToe() {

		gameBoard = new char[BOARDSIZE][BOARDSIZE];
		initializeGameboard();
	}

	public static void main(String[] args) {

	}

	/**
	 * Short one line description.                           (1)
	 * <p>
	 * Longer description. If there were any, it would be    (2)
	 * here.
	 * <p>
	 * And even more explanations to follow in consecutive
	 * paragraphs separated by HTML paragraph breaks.
	 */
	public void initializeGameboard() {
		for (int row = 0; row < BOARDSIZE; row++) {
			for (int col = 0; col < BOARDSIZE; col++) {
				gameBoard[row][col] = Character.forDigit(row * 3 + col, 10);
			}
		}
	}

	/**
	 * Short one line description.                           (1)
	 * <p>
	 * Longer description. If there were any, it would be    (2)
	 * here.
	 * <p>
	 * And even more explanations to follow in consecutive
	 * paragraphs separated by HTML paragraph breaks.
	 * 
	 * @return Description text text text.
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
	 * Short one line description.                           (1)
	 * <p>
	 * Longer description. If there were any, it would be    (2)
	 * here.
	 * <p>
	 * And even more explanations to follow in consecutive
	 * paragraphs separated by HTML paragraph breaks.
	 *
	 * @param  position Description text text text.          (3)
	 * @return Description text text text.
	 */
	private BoardCoords convertBoardPosition(int position) {
		int row = position / BOARDSIZE;
		int col = position % BOARDSIZE;
		return new BoardCoords(row, col);
	}

	/**
	 * Short one line description.                           (1)
	 * <p>
	 * Longer description. If there were any, it would be    (2)
	 * here.
	 * <p>
	 * And even more explanations to follow in consecutive
	 * paragraphs separated by HTML paragraph breaks.
	 *
	 * @param  position Description text text text.          (3)
	 * @return Description text text text.
	 */
	private boolean validatePosition(int position) {
		if (position > 9 || position < 1) {
			return false;
		}
		return true;
	}

	/**
	* Short one line description.                           (1)
	* <p>
	* Longer description. If there were any, it would be    (2)
	* here.
	* <p>
	* And even more explanations to follow in consecutive
	* paragraphs separated by HTML paragraph breaks.
	*
	* @return Description text text text.
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
	 * Short one line description.                           (1)
	 * <p>
	 * Longer description. If there were any, it would be    (2)
	 * here.
	 * <p>
	 * And even more explanations to follow in consecutive
	 * paragraphs separated by HTML paragraph breaks.
	 *
	 * @param  symbol Description text text text.          (3)
	 * @return Description text text text.
	 */
	private int getPlayerFromSymbol(char symbol) {
		if (symbol == PLAYERONESYMBOL) {
			return PLAYERONE;
		}
		return PLAYERTWO;
	}

	/**
	 * Short one line description.                           (1)
	 * <p>
	 * Longer description. If there were any, it would be    (2)
	 * here.
	 * <p>
	 * And even more explanations to follow in consecutive
	 * paragraphs separated by HTML paragraph breaks.
	 *
	 * @param  player Description text text text.          (3)
	 * @param  position Description text text text.          (3)
	 * @return Description text text text.
	 */
	public boolean insertSymbol(int player, int position) {
		if (validatePosition(position)) {
			BoardCoords coords = convertBoardPosition(position - 1);
			if (gameBoard[coords.row][coords.col] != PLAYERONESYMBOL
					&& gameBoard[coords.row][coords.col] != PLAYERTWOSYMBOL) {
				if (player == PLAYERTWO) {
					gameBoard[coords.row][coords.col] = PLAYERTWOSYMBOL;
				} else {
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