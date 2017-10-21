package is.ru.hugb;

public class TicTacToe{
	private char[][] gameBoard;
	private final int BOARDSIZE = 3;
	private final int PLAYERONE = 1;
	private final int PLAYERTWO = 2;
	private final char PLAYERONESYMBOL = 'x';
	private final char PLAYERTWOSYMBOL = 'o';
	public TicTacToe() {
		
		gameBoard = new char[BOARDSIZE][BOARDSIZE];
		initializeGameboard();
	}

	public static void main(String[] args) {   
		
	}
	/**
	*
	*@param
	*@return returns a string representation of the current board state
	*/

	public void initializeGameboard() {
		for(int row = 0; row < BOARDSIZE; row++) {
			for(int col = 0; col < BOARDSIZE; col++) {
				gameBoard[row][col] = Character.forDigit(row * 3 + col, 10);
			}
		}
	}
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for(int row = 0; row < BOARDSIZE; row++) {
			for(int col = 0; col < BOARDSIZE; col++) {
				builder.append(gameBoard[row][col]);
			}
			builder.append("\n");
		}
		return builder.toString();
	}

	private BoardCoords convertBoardPosition(int position) {
		int row = position / BOARDSIZE;
		int col = position % BOARDSIZE;
		return new BoardCoords(row, col);		
	}
	private boolean validatePosition(int position) {
		if(position > 9 || position < 1) {
			return false;
		}
		return true;
	}

	public int isGameOver() {
		for(int i = 0; i < BOARDSIZE; i++) {
			if(gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][0] == gameBoard[i][2]) {
				return getPlayerFromSymbol(gameBoard[i][0]);
			}
		}
		for(int i = 0; i < BOARDSIZE; i++) {
			if(gameBoard[0][i] == gameBoard[1][i] && gameBoard[0][i] == gameBoard[2][i]) {
				return getPlayerFromSymbol(gameBoard[0][i]);
			}
		}
		if(gameBoard[0][0] == gameBoard[1][1] && gameBoard[0][0] ==gameBoard[2][2]) {
			return getPlayerFromSymbol(gameBoard[0][0]);
		}
		if(gameBoard[0][2] == gameBoard[1][1] && gameBoard[0][2] ==gameBoard[2][0]) {
			return getPlayerFromSymbol(gameBoard[0][2]);
		}
		int symbolCounter = 0;
		for(int i = 0; i < BOARDSIZE; i++) {
			for(int j = 0; j < BOARDSIZE; j++) {
				if(gameBoard[i][j] == PLAYERONESYMBOL || gameBoard[i][j] == PLAYERTWOSYMBOL) {
					symbolCounter++;
				}
			}
		}
		if(symbolCounter == 9) {
			return 4;
		}
		return 0;
	}

	private int getPlayerFromSymbol(char symbol) {
		if(symbol == PLAYERONESYMBOL) {
			return PLAYERONE;
		}
		return PLAYERTWO;
	}
	public boolean insertSymbol(int player, int position) {
		if(validatePosition(position)) {
			BoardCoords coords = convertBoardPosition(position - 1);
			if(gameBoard[coords.row][coords.col] != PLAYERONESYMBOL && gameBoard[coords.row][coords.col] != PLAYERTWOSYMBOL) {
				if(player == PLAYERTWO) {
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

	private class BoardCoords{
		private int row;
		private int col;
		BoardCoords(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}
}