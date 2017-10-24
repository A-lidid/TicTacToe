package is.ru.hugb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeServiceTest {
	static TicTacToeService service = new TicTacToeService();

	@Test
	public void testToString() {
		service.initialize();
		assertEquals("012\n345\n678\n", service.toString());
	}

	@Test
	public void testInitialize() {
		service.initialize();
		assertEquals("012\n345\n678\n", service.toString());
	}

	@Test
	public void testInsertSymbol() {
		service.initialize();
		assertEquals(true, service.insertSymbol(2));
		assertEquals("0x2\n345\n678\n", service.toString());
	}

}