package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		

	}
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		do {
			System.out.println("1. Nueva pizza");
			System.out.println("2. Nuevo cliente");
			System.out.println("3. Realizar un pedido");
			System.out.println("4. Ver pizzas");
			System.out.println("5. Salir");
			
			opcion = sc.nextInt();
			System.out.println("-----------------------------------------");
			System.out.println();
			
			switch(opcion) {
			case 1:
				System.out.println("Paso 1");
				System.out.println("-------------------------------------------");
				System.out.println();
				break;
			case 2:
				System.out.println("Esta funcionalidad no está implementada aún");
				System.out.println("-------------------------------------------");
				System.out.println();
				break;
			case 3:
				System.out.println("Esta funcionalidad no está implementada aún");
				System.out.println("-------------------------------------------");
				System.out.println();
				break;
			case 4:

				System.out.println();
				break;
			default:
				System.out.println("Saliendo...");
				break;
				
			}
		}
		while(opcion > 0 && opcion <= 4);
		
	}

}
