package is.ru.hugb;

public class TicTacToeService {
	private TicTacToe ticTacToe = new TicTacToe();
	private int turnCount = 0;

	public String toString() {
		return ticTacToe.toString();
	}
	public void initialize() {
		turnCount = 0;
		ticTacToe.initializeGameboard();
	}
	public boolean insertSymbol(int number) {
		ticTacToe.insertSymbol(turnCount % 2 + 1, number);
		turnCount++;
		return true;
	}
}