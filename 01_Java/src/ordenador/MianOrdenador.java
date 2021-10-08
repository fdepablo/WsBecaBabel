package ordenador;

import java.util.ArrayList;
import java.util.List;

public class MianOrdenador {
	public static void main(String[] args) {
		List<Periferico> listaPerifericos = new ArrayList<Periferico>();
		
		Raton raton = new Raton();
		raton.setBotones(9);
		raton.setInalambrico(false);
		raton.setPrecio(60);
		//1. Heredamos, metodos y atibutos (todos) no heredamos contrustores
		
		//2. Con una referencia padre puedo apuntar a cualquier objeto hijo
		Periferico p1 = raton;
		listaPerifericos.add(raton);
		
		//3. Con una referencia solamente puedo acceder a los metodos y atributos
		//de la referencia
		//No se puede :(
		//p1.setBotones(3);
		
		Teclado teclado = new Teclado();
		teclado.setMarca("Logitech");
		teclado.setPrecio(100);
		teclado.setTipo("mecanico");
		
		listaPerifericos.add(teclado);
		
		for(Periferico p : listaPerifericos) {
			System.out.println(p.getPrecio());
			System.out.println(p.getMarca());
			if(p instanceof Raton) {
				Raton r = (Raton)p;
				System.out.println(r.getBotones());
			}else if(p instanceof Teclado) {
				Teclado t = (Teclado)p;
				System.out.println(t.getTipo());
			}			
		}
		
		//Teclado t = new Raton();//NO
		//Teclado t = new Periferico();//No
		//Object o = new Raton();//SI
		//Object o = new ArrayList<Periferico>();//SI
		//o.add(raton);//NO
		//Object o = new int[5];//SI
		//La respuesta "puedo con una referencia de tipo objetc a apuntar a [    ]
		//siempre siempre siempre y siempre es SI
	
		//Object o = new Raton();
		//Polimoformismo
		Periferico p = raton;
		System.out.println(p.calcularPrecioTotal());
		p = teclado;
		System.out.println(p.calcularPrecioTotal());
		
		for(Periferico pAux : listaPerifericos) {
			System.out.println(pAux.getPrecio());
			System.out.println(pAux.getMarca());
			System.out.println(pAux.calcularPrecioTotal());
		}
		
		//System.out.println(listaPerifericos);
		
	}
}
