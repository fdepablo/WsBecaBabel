package main;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
	 	Scanner sc= new Scanner (System.in);
		System.out.println("Escribe 3 numeros: ");
		
		IsPrime primo = new IsPrime();
		primo.setNum(sc.nextInt());
		Thread t1 = new Thread(primo);
		
		IsPrime primo2 = new IsPrime();
		primo2.setNum(sc.nextInt());
		Thread t2 = new Thread(primo2);
		
		IsPrime primo3 = new IsPrime();
		primo3.setNum(sc.nextInt());
		Thread t3 = new Thread(primo3);
	 
		t1.start();
		t2.start();
		t3.start();

	}

}