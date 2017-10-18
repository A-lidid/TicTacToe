package is.ru.hugb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest{
	static TicTacToe game = new TicTacToe();
	@Test
	public void returnGameBoard() {
		assertEquals("012\n345\n678\n", game.returnGameBoard());
	}
	@Test
	public void testInsertSymbol() {
		assertEquals(true, game.insertSymbol(1,1));
		assertEquals("x12\n345\n678\n", game.returnGameBoard());
		assertEquals(false, game.insertSymbol(1,0));
		assertEquals(false, game.insertSymbol(1,10));
		assertEquals(true, game.insertSymbol(1,9));
		assertEquals("x12\n345\n67x\n", game.returnGameBoard());
		assertEquals(true, game.insertSymbol(2,2));
		assertEquals("xo2\n345\n67x\n", game.returnGameBoard());
		assertEquals(false, game.insertSymbol(2,1));
	}
}