import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCafe {
	Cafe cafe = new Cafe(15);
	@Test
	void testHayCafe() {
		boolean hayCafe = cafe.verificarHayCafe(10);
		assertEquals(true,hayCafe);
	}
	
	@Test
	void testNoHayCafe() {
		boolean noHayCafe = cafe.verificarSiNoHayCafe(16);
		assertEquals(false,noHayCafe);
	}
	
	@Test
	void testRestarCafe() {
		cafe.darCafe(7);
		assertEquals(8,cafe.getCantCafeActual());
	}

}
