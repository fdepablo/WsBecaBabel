package spel.entity;

public class Monitor extends Periferico {

	private static final long serialVersionUID = 1L;
	private double hz;
	private double tama�o;
	
	public double getHz() {
		return hz;
	}
	
	public void setHz(double hz) {
		this.hz = hz;
	}
	
	public double getTama�o() {
		return tama�o;
	}
	
	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return super.toString() + "Monitor [hz=" + hz + ", tama�o=" + tama�o + "]";
	}
	
}