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

	public boolean insertSymbol(int player, int position) {
		return false;
	}

}