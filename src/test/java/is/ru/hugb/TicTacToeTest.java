package is.ru.hugb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest{
	static TicTacToe game = new TicTacToe();

	@Test
	public void returnGameBoard() {
		game.initializeGameboard();
		assertEquals("012\n345\n678\n", game.toString());
	}

	@Test
	public void testSymbolChanges() {
		assertEquals(true, game.insertSymbol(1, 1));
		assertEquals("x12\n345\n678\n", game.toString());
		assertEquals(false, game.insertSymbol(1, 10));
		assertEquals(false, game.insertSymbol(1, 0));
	}

	@Test
	public void testInitializeGameboard() {
		game.initializeGameboard();
		assertEquals("012\n345\n678\n", game.toString());
		assertEquals(true, game.insertSymbol(1, 1));
		game.initializeGameboard();
		assertEquals("012\n345\n678\n", game.toString());
	}
}
