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
		
		return 0;
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