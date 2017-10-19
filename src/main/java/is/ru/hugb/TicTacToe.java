package is.ru.hugb;

public class TicTacToe{
	private char[][] gameBoard;
	private final int BOARDSIZE = 3;
	public TicTacToe() {
		
		gameBoard = new char[BOARDSIZE][BOARDSIZE];
		for(int row = 0; row < BOARDSIZE; row++) {
			for(int col = 0; col < BOARDSIZE; col++) {
				gameBoard[row][col] = Character.forDigit(row * 3 + col, 10);
			}
		}
	}
	public static void main(String[] args) {   
		
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

	public boolean insertSymbol(int player, int position) {
		gameBoard[0][0] = 'x';
		return true;
	}
}