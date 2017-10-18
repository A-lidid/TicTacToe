package is.ru.hugb;

public class TicTacToe{

	private final int BOARDSIZE = 3;	
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
	public boolean insertSymbol(int player, int position) {
		if(validatePosition(position)) {
			BoardPosition pos = convertPosition(position - 1);
			if(gameBoard[pos.row][pos.col] == '0') {
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