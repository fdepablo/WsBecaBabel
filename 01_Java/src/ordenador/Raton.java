package ordenador;

//Una clase instanciable no puede tener ningun metodo abstracto
//Una clase abstracta puedo tener o no metodos abstractos
public class Raton extends Periferico {
	
	private double peso;
	private int botones;
	private boolean inalambrico;
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public int getBotones() {
		return botones;
	}
	
	public void setBotones(int botones) {
		this.botones = botones;
	}
	
	public boolean isInalambrico() {
		return inalambrico;
	}
	
	public void setInalambrico(boolean inalambrico) {
		this.inalambrico = inalambrico;
	}

	@Override
	public String toString() {
		String isInalambric = inalambrico ? "si" : "No";
		return super.toString() + "Raton [peso=" + peso + ", botones=" + botones + ", inalambrico=" + 
				isInalambric + "]";
	}
	
	@Override
	public double calcularPrecioTotal() {
		double precioTotal = this.getPrecio();
		return precioTotal *= 1.10;
	}
	
}