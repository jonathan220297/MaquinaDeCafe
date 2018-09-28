
public class MaquinaCafe {
	private Cafe cafe;
	private Azucar azucar;
	private Vaso vaso;
	
	
	
	public MaquinaCafe() {
		super();
	}

	public MaquinaCafe(Cafe cafe, Azucar azucar, Vaso vaso) {
		super();
		this.cafe = cafe;
		this.azucar = azucar;
		this.vaso = vaso;
	}

	public Cafe getCafe() {
		return cafe;
	}

	public void setCafe(Cafe cafe) {
		this.cafe = cafe;
	}

	public Azucar getAzucar() {
		return azucar;
	}

	public void setAzucar(Azucar azucar) {
		this.azucar = azucar;
	}

	public Vaso getVaso() {
		return vaso;
	}

	public void setVaso(Vaso vaso) {
		this.vaso = vaso;
	}
	
	public boolean comprarCafe(int tipo, int cantCafe, int cantAzucar) {
		boolean resultado = false;
		switch(tipo) {
		case 1:
			if(vaso.verificarSiHayVaso(tipo, 1)) {
				if(azucar.verificarSiHayAzucar(cantAzucar)) {
					if(cafe.verificarHayCafe(cantCafe)) {
						resultado = true;
					}
				}
			}
			break;
		case 2:
			if(vaso.verificarSiHayVaso(tipo, 1)) {
				if(azucar.verificarSiHayAzucar(cantAzucar)) {
					if(cafe.verificarHayCafe(cantCafe)) {
						resultado = true;
					}
				}
			}
			break;
		case 3:
			if(vaso.verificarSiHayVaso(tipo, 1)) {
				if(azucar.verificarSiHayAzucar(cantAzucar)) {
					if(cafe.verificarHayCafe(cantCafe)) {
						resultado = true;
					}
				}
			}
			break;
		}
		
		return resultado;
	}
}
