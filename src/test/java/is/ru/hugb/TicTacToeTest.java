package is.ru.hugb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest{
	static TicTacToe game = new TicTacToe();
	@Test
	public void returnGameBoard() {
		assertEquals("123\n456\n789\n", game.returnGameBoard());
	}
}