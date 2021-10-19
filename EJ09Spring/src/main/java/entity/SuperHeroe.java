package entity;

public class SuperHeroe {

	public static int contId = 0;
	private int id;
	private String nombre;
	private String nombreSuperHeroe;
	private int poder;
	private String superPoder;
	
	public SuperHeroe() {
		this.id = SuperHeroe.contId++;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombreSuperHeroe() {
		return nombreSuperHeroe;
	}
	
	public void setNombreSuperHeroe(String nombreSuperHeroe) {
		this.nombreSuperHeroe = nombreSuperHeroe;
	}
	
	public int getPoder() {
		return poder;
	}
	
	public void setPoder(int poder) {
		this.poder = poder;
	}
	
	public String getSuperPoder() {
		return superPoder;
	}
	
	public void setSuperPoder(String superPoder) {
		this.superPoder = superPoder;
	}

	@Override
	public String toString() {
		return "SuperHeroe [id=" + id + ", nombre=" + nombre + ", nombreSuperHeroe=" + nombreSuperHeroe + ", poder="
				+ poder + ", superPoder=" + superPoder + "]";
	}
	
}
