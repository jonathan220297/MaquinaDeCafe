
public class Cafe {
	private int cantCafeActual;

	public Cafe() {
		super();
	}

	public Cafe(int cantCafeActual) {
		super();
		this.cantCafeActual = cantCafeActual;
	}

	public int getCantCafeActual() {
		return cantCafeActual;
	}

	public void setCantCafeActual(int cantCafeActual) {
		this.cantCafeActual = cantCafeActual;
	}
	
	//Metodos
	public boolean verificarHayCafe(int cantCafe) {
		boolean resultado = false;
		if(cantCafe <= cantCafeActual) {
			resultado = true;
		}
		
		return resultado;
	}
	
	public boolean verificarSiNoHayCafe(int cantCafe) {
		boolean resultado = true;
		if(cantCafe > cantCafeActual) {
			resultado = false;
		}
		
		return resultado;
	}
	
	public void darCafe(int cantCafe) {
		cantCafeActual = cantCafeActual - cantCafe;
	}

}
