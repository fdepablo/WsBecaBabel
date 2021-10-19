package main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.SuperHeroe;

public class Main {
	
	public static ApplicationContext context = null;
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		int opcion = 0;
		
		do {
			
			opcion = getOptionMenu();
			
			switch(opcion) {
				case 1:
					printPrincipalHeroes();
					break;
					
				case 2:
					addHeroeWithPower();
					break;
					
				case 3:
					addHeroeWithSuperPower();
					break;
					
				case 4:
					printSuperHeroes(context.getBean("listaPoder", List.class));
					break;
					
				case 5:
					printSuperHeroes(context.getBean("listaSuperPoder", List.class));
					break;
					
				case 0:
					break;
			}
			
		} while(opcion != 0);
	}

	public static int getOptionMenu() {
		System.out.println("---------------------Menu SuperHeroes---------------------\n"
				+ "\t 1. Listar los tres superheroes principales\n" 
				+ "\t 2. Añadir un superheroe con poder 100\n"
				+ "\t 3. Añadir un superheroe con superpoder 'volar'\n"
				+ "\t 4. Listar superhereos con potenia 100\n"
				+ "\t 5. Listar superheroes con superpoder 'volar'\n"
				+ "\t 0. Salir");
		
		return Integer.parseInt(sc.nextLine());
	}
	
	public static void printPrincipalHeroes() {
		System.out.println(context.getBean("spiderman", SuperHeroe.class));
		System.out.println(context.getBean("thor", SuperHeroe.class));
		System.out.println(context.getBean("hulk", SuperHeroe.class));
	}
	
	public static void addHeroeWithPower() {
		SuperHeroe heroePoder = context.getBean("heroePoder", SuperHeroe.class);
		getInfoSuperHeroe(heroePoder);
		List<SuperHeroe> superHeroesPoder = context.getBean("listaPoder", List.class);
		superHeroesPoder.add(heroePoder);
	}
	
	private static void addHeroeWithSuperPower() {
		SuperHeroe heroeSuperPoder = context.getBean("heroeSuperPoder", SuperHeroe.class);
		getInfoSuperHeroe(heroeSuperPoder);		
		List<SuperHeroe> superHeroesSuperPoder = context.getBean("listaSuperPoder", List.class);
		superHeroesSuperPoder.add(heroeSuperPoder);
	}
	
	public static void getInfoSuperHeroe(SuperHeroe heroe) {
		
		System.out.println("Introduzca el nombre real del superheroe");
		heroe.setNombre(sc.nextLine());
		System.out.println("Introduzca el nombre de superheroe");
		heroe.setNombreSuperHeroe(sc.nextLine());
		
		if (heroe.getSuperPoder() == null) {
			System.out.println("Introduzca el nombre del superpoder");
			heroe.setSuperPoder(sc.nextLine());
		}
		
		if (heroe.getPoder() == 0) {
			System.out.println("Introduzca la cantidad de poder del superheroe");
			heroe.setPoder(Integer.parseInt(sc.nextLine()));
		}
	}
	
	public static void printSuperHeroes(List<SuperHeroe> superHeroesList) {
		for (SuperHeroe h: superHeroesList) {
			System.out.println(h);
		}
	}	

}
