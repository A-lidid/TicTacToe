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
		assertEquals(true, game.insertSymbol(1, 2));
		assertEquals(true, game.insertSymbol(1, 3));
		assertEquals(true, game.insertSymbol(1, 4));
		assertEquals(true, game.insertSymbol(1, 5));
		assertEquals(true, game.insertSymbol(1, 6));
		assertEquals(true, game.insertSymbol(1, 7));
		assertEquals(true, game.insertSymbol(1, 8));
		assertEquals(true, game.insertSymbol(1, 9));
		assertEquals("xxx\nxxx\nxxx\n", game.toString());
		game.initializeGameboard();
		assertEquals("012\n345\n678\n", game.toString());
	}
	@Test
	public void testCorrectSymbolInsertedForPlayer2() {
		game.initializeGameboard();
		assertEquals(true, game.insertSymbol(2, 1));
		assertEquals("o12\n345\n678\n", game.toString());
	}

	@Test
	public void testCantOverwriteOtherSquare(){
		game.initializeGameboard();
		assertEquals(true, game.insertSymbol(1, 1));
		assertEquals(false, game.insertSymbol(2, 1));
		assertEquals("x12\n345\n678\n", game.toString());
		assertEquals(true, game.insertSymbol(2, 2));
		assertEquals(false, game.insertSymbol(1, 2));
		assertEquals("xo2\n345\n678\n", game.toString());
		assertEquals(false, game.insertSymbol(1, 1));
		assertEquals(false, game.insertSymbol(2, 2));
	}
}
