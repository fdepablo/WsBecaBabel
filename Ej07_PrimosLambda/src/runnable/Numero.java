package runnable;
public class Numero implements Runnable{
	private static int cont;
	private int id;
	private int numero;
	
	
	public Numero(int numero) {
		id = cont ++;
		this.numero = numero;
	}
	
	Runnable runnable = () ->{
		double tiempo1 = System.currentTimeMillis();
		comprobar();
		double tiempo2 = System.currentTimeMillis();
		System.out.println("Tiempo de ejecuci�n de hilo " + id+": "+(tiempo2-tiempo1) +" ms");
	};
	

	private void comprobar() {
		boolean primo = true;
		// El 0, 1 y 4 no son primos
		  if (numero == 0 || numero == 1 || numero == 4) {
			  primo = false;
		
		  }
		  for (int x = 2; x < numero / 2; x++) {
		    // Si es divisible por cualquiera de estos n�meros, no
		    // es primo
		    if (numero % x == 0) {
		    primo = false;
		     
		    }
		  }
		  // Si no se pudo dividir por ninguno de los de arriba, s� es primo
		  
		  
		if(primo) {
			System.out.println("Hilo "+id +": " + numero +" SI es primo");
		}else {
			System.out.println("Hilo "+id +": " + numero +" no es primo");
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}