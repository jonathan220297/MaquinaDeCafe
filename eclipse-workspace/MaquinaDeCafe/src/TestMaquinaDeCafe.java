import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestMaquinaDeCafe {
	Cafe cafe = new Cafe(50);
	Vaso vaso = new Vaso(10,7,5);
	Azucar azucar = new Azucar(30);
	MaquinaCafe maquinaCafe = new MaquinaCafe(cafe,azucar,vaso);
	
	@Test
	public void deberiaDevolverVasoPequeno() {
		assertEquals(true,maquinaCafe.getVaso().verificarSiHayVaso(1, 5));
	}
	
	@Test
	public void deberiaDevolverVasoMediano() {
		assertEquals(true,maquinaCafe.getVaso().verificarSiHayVaso(2, 1));
	}
	
	@Test
	public void deberiaDevolverVasoGrande() {
		assertEquals(true,maquinaCafe.getVaso().verificarSiHayVaso(3, 4));
	}
	
	@Test
	public void deberiaDevolverNoHayAzucar() {
		assertEquals(false,maquinaCafe.getAzucar().verificarSiNoHayAzucar(31));
	}
	
	@Test
	public void deberiaDevolverNoHayCafe() {
		assertEquals(false,maquinaCafe.getCafe().verificarSiNoHayCafe(51));
	}
	
	@Test
	public void deberiaDevolverNoHayVaso() {
		assertEquals(false,maquinaCafe.getVaso().verificarSiNoHayVaso(1, 11));
	}
	
	@Test
	public void deberiaRestarCafe() {
		maquinaCafe.getCafe().darCafe(7);
		assertEquals(43,maquinaCafe.getCafe().getCantCafeActual());
	}
	
	@Test
	public void deberiaRestarVaso() {
		maquinaCafe.getVaso().darVaso(1, 3);
		assertEquals(7,maquinaCafe.getVaso().getCantidadVasosPequeños());
	}
	
	@Test
	public void deberiaRestarAzucar() {
		maquinaCafe.getAzucar().restarAzucar(10);
		assertEquals(20,maquinaCafe.getAzucar().getCantidadAzucar());
	}
	
	@Test
	public void deberiaVenderTodo() {
		assertEquals(true,maquinaCafe.comprarCafe(2,3,2));
	}
	
}
