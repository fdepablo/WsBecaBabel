package i18n;

public class Espaniol implements I18n{

	@Override
	public String get(int clave) {
		if(clave == 0){
			return "La bbdd esta caida";
		}
		
		return "";
	}
	

}
