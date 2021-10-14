package main;
 
/**
 * Class IsPrime comprueba si el numero introducido es un primo con una salida de respuesta:
 * 			<ul>
 * 				<li>numero a�adido + texto si es o no primo + tiempo en microsegundos de la ejecuci�n
 * 			</ul>
 * @author moaadsensei
 *
 */
public class IsPrime extends Thread {
	private long num;

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public void run() {
		boolean notPrime=false; //inicializamos notPrime como false para hacer las respectivas comprobaciones (false = prime, true = notprime)
		double startTime = System.nanoTime(); //El System.nanoTime(), es la unidad de medida nanosegundos en el que muestra el tiempo de ejecucion del hilo, y lo igualamos  
		//a un double para poder sacar m�s adelante el tiempo total de la ejecuci�n.
		
		//formula para saber si es primo o no.
		for (int x = 2; x < num / 2; x++) {
			if (num % x == 0) {
				double time = (System.nanoTime() - startTime) / 1000; //restamos el tiempo inicial de ejecucion con el tiempo final de esta para saber el tiempo que ha tardado 
				//ejecutandose
				System.out.println(num + " NO es un numero Primo y ha tardado: " + time + "�s (microsegundos) en realizar el hilo" );
				notPrime=true;
				break; //en el caso que entre aqu�, notPrime ser� true para que no entre en la futura condici�n, a dem�s de hacer un break para parar salir de la condici�n.
			} 
 		} 	
		
		double time = (System.nanoTime() - startTime) / 1000;//volvemos a realizar lo mismo pero fuera de la condicion
		if(!notPrime) {
			System.out.println(num + " es un numero Primo y ha tardado: " + time + "�s (microsegundos) en realizar el hilo");
			}
 
		

	}
}