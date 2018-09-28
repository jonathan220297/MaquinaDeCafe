
public class Vaso {
	private int tipoVaso;
	private int cantidadVasosPeque�os;
	private int cantidadVasosMedianos;
	private int cantidadVasosGrandes;
	
	public Vaso() {
		super();
	}

	
	public Vaso(int cantidadVasosPeque�os, int cantidadVasosMedianos, int cantidadVasosGrandes) {
		super();
		this.cantidadVasosPeque�os = cantidadVasosPeque�os;
		this.cantidadVasosMedianos = cantidadVasosMedianos;
		this.cantidadVasosGrandes = cantidadVasosGrandes;
	}

	public int getTipoVaso() {
		return tipoVaso;
	}


	public void setTipoVaso(int tipoVaso) {
		this.tipoVaso = tipoVaso;
	}


	public int getCantidadVasosPeque�os() {
		return cantidadVasosPeque�os;
	}


	public void setCantidadVasosPeque�os(int cantidadVasosPeque�os) {
		this.cantidadVasosPeque�os = cantidadVasosPeque�os;
	}


	public int getCantidadVasosMedianos() {
		return cantidadVasosMedianos;
	}


	public void setCantidadVasosMedianos(int cantidadVasosMedianos) {
		this.cantidadVasosMedianos = cantidadVasosMedianos;
	}


	public int getCantidadVasosGrandes() {
		return cantidadVasosGrandes;
	}


	public void setCantidadVasosGrandes(int cantidadVasosGrandes) {
		this.cantidadVasosGrandes = cantidadVasosGrandes;
	}

	//Metodos
	public boolean verificarSiHayVaso(int tipo, int cant) {
		boolean resultado = false;
		switch(tipo) {
		case 1:
			if(cant <= cantidadVasosPeque�os) {
				resultado = true;
			}
			break;
		case 2:
			if(cant <= cantidadVasosMedianos) {
				resultado = true;
			}
			break;
		case 3:
			if(cant <= cantidadVasosGrandes) {
				resultado = true;
			}
			break;
		}
		return resultado;
	}
	
	public boolean verificarSiNoHayVaso(int tipo, int cant) {
		boolean resultado = true;
		switch(tipo) {
		case 1:
			if(cant > cantidadVasosPeque�os) {
				resultado = false;
			}
			break;
		case 2:
			if(cant > cantidadVasosMedianos) {
				resultado = false;
			}
			break;
		case 3:
			if(cant > cantidadVasosGrandes) {
				resultado = false;
			}
			break;
		}
		return resultado;
	}
	
	public void darVaso(int tipo, int cant) {
		switch(tipo) {
		case 1:
			cantidadVasosPeque�os = cantidadVasosPeque�os - cant;
			break;
		case 2:
			cantidadVasosMedianos = cantidadVasosMedianos - cant;
			break;
		case 3:
			cantidadVasosGrandes = cantidadVasosGrandes - cant;
			break;
		}
	}

}
