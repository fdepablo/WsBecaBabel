package main;

import java.util.Scanner;

import modelo.entidad.Persona;

public class MainMaven {
	public static void main(String[] args) {
		System.out.println("Bienvenidos a nuestro programa!");
		
		Scanner sc = new Scanner(System.in);
		Persona p = new Persona();
		
		System.out.println("Introduzca el nombre de la persona");
		p.setNombre(sc.nextLine());
		System.out.println("Introduzca la edad de la persona");
		p.setEdad(sc.nextInt());
		
		System.out.println("La persona introducida es: " + p);
		sc.close();
	}
}
