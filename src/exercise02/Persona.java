/*
 * Crea un programa con una clase llamada Persona que representará los datos principales de una persona: 
 * dni, nombre, apellidos y edad.
 */

package exercise02;

import java.util.Scanner;

public class Persona {

	String dni;
	String nombre;
	String apellidos;
	int edad;
	
	//Creamos una función para pedir todos los datos
	void pedirNombre (Scanner sc) {
	
		//Pedimos el nombre al usuario
		System.out.print("Introduce el nombre de la persona: ");
		nombre = sc.nextLine();
			
	}
	
	//Creamos una función para pedir el apellido
	void pedirApellido (Scanner sc) {
		
		//Pedimos el apellido del usuario
		System.out.print("Introduce los apellidos de la persona: ");
		apellidos = sc.nextLine();
	}
	
	//Creamos una función para pedir la edad de la persona
	void pedirEdad(Scanner sc) {
		
		//Pedimos la edad al usuario
		System.out.println("Introduzca la edad de la persona");
		edad = sc.nextInt();
	}
	
	void pedirDni(Scanner sc) {
		
		//Pedimos el dni al usuario
		
	}
}
