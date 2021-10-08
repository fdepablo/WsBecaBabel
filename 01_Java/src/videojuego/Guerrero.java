package videojuego;

public class Guerrero{
	private String nombre;
	private Arma arma;
	
	public void atacar() {
		System.out.println("Argggggg!! soy " + nombre);
		arma.usar();//polimorfismo
		if(getArma() instanceof Arco) {
			System.out.println("Estoy atacando con un arco");
		}else if(getArma() instanceof Espada) {
			System.out.println("Estoy atacando con una esapda");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	
}
