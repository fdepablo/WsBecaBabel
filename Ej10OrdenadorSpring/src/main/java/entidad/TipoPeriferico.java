package entidad;

public enum TipoPeriferico {
	RATON,TECLADO,MONITOR;
	
	//private String atributo1;
	
	//el constructor debe de ser privada
	private TipoPeriferico() {
		
	}
	
	public String saludar() {
		return "hola soy un " + this.name() + " y te saludo";
	}
}
