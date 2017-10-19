package is.ru.hugb;

public class TicTacToe{

	private final int BOARDSIZE = 3;
	private final int PLAYERONE = 1;
	private final int PLAYERTWO = 2;
	private final char playerOneSymbol = 'x';
	private final char playerTwoSymbol = 'o';
	private char[][] gameBoard;

	TicTacToe() {
		gameBoard = new char[BOARDSIZE][BOARDSIZE];
		for(int i = 0; i < BOARDSIZE; i++) {
			for(int j = 0; j < BOARDSIZE; j++) {
				gameBoard[i][j] = Character.forDigit( i * 3 + j, 10);
			}
		}
	}
	public static void main(String[] args) {   
		
	}
	/**
	*
	*@param
	*@return returns a string representation of the current board state
	*/
	public String returnGameBoard() {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < BOARDSIZE; i++) {
			for(int j = 0; j < BOARDSIZE; j++) {
				builder.append(gameBoard[i][j]);
			}
			builder.append("\n");
		}
		return new String(builder);
	}

	private BoardPosition convertPosition(int position) {
		BoardPosition pos = new BoardPosition();
		pos.row = position / BOARDSIZE;
		pos.col = position % BOARDSIZE;
		return pos;
	}

	private boolean validatePosition(int position) {
		if(position < 1 || position > 9) {
			return false;
		}
		return true;
	}

	public boolean isGameOver() {
		return false;
	}
	/**
	*
	*@param player the player who's turn it is
	*@param position the board position to place the active players symbol
	*@return return true if symbol was placed or false otherwise
	*/
	public boolean insertSymbol(int player, int position) {
		if(validatePosition(position)) {
			BoardPosition pos = convertPosition(position - 1);
			if(gameBoard[pos.row][pos.col] != playerOneSymbol && gameBoard[pos.row][pos.col] != playerTwoSymbol) {
				if(player == PLAYERONE) {
					gameBoard[pos.row][pos.col] = playerOneSymbol;
				}
				else {
					gameBoard[pos.row][pos.col] = playerTwoSymbol;
				}
				return true;
			}
		}
		return false;
	}

	private class BoardPosition {
		private int row;
		private int col;
	}

}