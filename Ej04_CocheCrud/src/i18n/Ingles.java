package i18n;

public class Ingles implements I18n{

	@Override
	public String get(int clave) {
		if(clave == 0){
			return "DB is down :(";
		}
		
		return "";
	}
	

}
