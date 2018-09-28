
public class Azucar {
	private int cantidadAzucar;
	
	
	//Constructor
	public Azucar() {
		super();
	}

	public Azucar(int cantidadAzucar) {
		super();
		this.cantidadAzucar = cantidadAzucar;
	}
	
	

	public boolean verificarSiHayAzucar(int cantAzucar) {
		boolean resultado = false;
		if(cantAzucar <= cantidadAzucar) {
			resultado = true;
		}
		
		return resultado;
	}
	
	public boolean verificarSiNoHayAzucar(int cantAzucar) {
		boolean resultado = true;
		if(cantAzucar > cantidadAzucar) {
			resultado = false;
		}
		
		return resultado;
	}
	
	public void restarAzucar(int cantAzucar) {
		cantidadAzucar = cantidadAzucar - cantAzucar;
	}
	
	//Setters & Getters
	
	public int getCantidadAzucar() {
		return cantidadAzucar;
	}

	public void setCantidadAzucar(int cantidadAzucar) {
		this.cantidadAzucar = cantidadAzucar;
	}


}
