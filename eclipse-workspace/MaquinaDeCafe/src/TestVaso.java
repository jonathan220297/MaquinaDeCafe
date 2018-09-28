import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestVaso {
	Vaso vaso = new Vaso(10,7,5);
	
	@Test
	void testSiHayVasos() {
		boolean resultado = vaso.verificarSiHayVaso(1,9);
		assertEquals(true, resultado);
	}
	
	@Test
	void testSiNoHayVasos() {
		boolean resultado = vaso.verificarSiNoHayVaso(2,8);
		assertEquals(false, resultado);
	}
	
	@Test
	void testRestarVasos() {
		vaso.darVaso(1,2);
		assertEquals(8,vaso.getCantidadVasosPequeños());
	}

}
