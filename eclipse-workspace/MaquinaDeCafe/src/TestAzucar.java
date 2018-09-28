import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class TestAzucar {
	Azucar azucar = new Azucar(20);
	
	@Before
	void setUp() {
		azucar.setCantidadAzucar(20);
	}

	@Test
	void testHayAzucar() {
		//Arrange
		boolean hayAzucar = false;
		
		
		//Act
		hayAzucar = azucar.verificarSiHayAzucar(5);
		
		//Assert
		assertEquals(true, hayAzucar);
		
		hayAzucar = azucar.verificarSiHayAzucar(10);
		
		assertEquals(true,hayAzucar);
	}
	
	@Test
	void testVerificarNoHayAzucar() {
		//Arrange
		boolean hayAzucar = false;
		
		//ACT
		hayAzucar = azucar.verificarSiNoHayAzucar(21);
		
		//Assert
		assertEquals(false,hayAzucar);
		
		//ACT
		hayAzucar = azucar.verificarSiNoHayAzucar(22);
				
		//Assert
		assertEquals(false,hayAzucar);
	}
	
	@Test
	void testDarAzucar() {
		//Act
		azucar.restarAzucar(10);
		//Assert
		assertEquals(10,azucar.getCantidadAzucar());
		
		//Act
		azucar.restarAzucar(3);
		//Assert
		assertEquals(7,azucar.getCantidadAzucar());
	}	
	
}
