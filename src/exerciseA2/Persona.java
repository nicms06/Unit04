/*
 * Crea un programa con una clase llamada Persona que representará los datos principales de una persona: 
 * dni, nombre, apellidos y edad.
 */

package exerciseA2;

import java.util.Scanner;

public class Persona {

	String dni;
	String nombre;
	String apellidos;
	int edad;
	boolean mayorEdad;
	
	//Creamos una función para pedir todos los datos
	void pedirNombre (Scanner sc) {
	
		//Pedimos el nombre al usuario
		System.out.print("Introduce el nombre de la persona: ");
		nombre = sc.nextLine();
		
		System.out.println("Nombre registrado.");
			
	}
	
	//Creamos una función para pedir el apellido
	void pedirApellido (Scanner sc) {
		
		//Pedimos el apellido del usuario
		System.out.print("Introduce los apellidos de la persona: ");
		apellidos = sc.nextLine();
		
		System.out.println("Apellidos registrados.");
	}
	
	//Creamos una función para pedir la edad de la persona
	void pedirEdad(Scanner sc) {
		
		//Pedimos la edad al usuario
		System.out.println("Introduzca la edad de la persona: ");
		edad = sc.nextInt();
		
		System.out.println("Edad registrada.");
		
		mayorEdad = edad >=18;
	
	}
	
	void pedirDni(Scanner sc) {
		
		//Declaramos una variable para la parte numérica y otra para la letra del dni
		int dniNum;
		char dniLetra;
		
		//Pedimos la parte numérica del dni al usuario
		System.out.print("Introduzca la parte numérica del DNI: ");
		dniNum = sc.nextInt();
		
		sc.nextLine();
		
		//Nos aseguramos de que tenga 8 dígitos
		while (dniNum < 10000000 || dniNum > 99999999) {
			System.out.println("ERROR. La parte numérica consta de 8 dígitos: ");
			dniNum = sc.nextInt();
		}
		
		//Pedimos el caracter del DNI
		System.out.print("Introduzca la letra del DNI: ");
		dniLetra = sc.nextLine().charAt(0);
		
		//Unimos la parte numérica del caracter
		this.dni = dniNum + "" + dniLetra;
		
		System.out.println("DNI registrado.");
		
	}
	
	//Creamos una función para pedir los datos
	void pedirDatos (Scanner sc) {
		//Pedimos el nombre
		pedirNombre(sc);
			
		//Pedimos los apellidos
		pedirApellido(sc);
			
		//Pedimos la edad
		pedirEdad(sc);
			
		//Pedimos el DNI
		pedirDni(sc);
			
	}
	
	//Creamos un último método para mostrar el mensaje
	void printMensaje() {
		if (mayorEdad == true) {
			System.out.println(nombre + " " + apellidos + " con DNI " + dni + " es mayor de edad.");
		}
		else {
			System.out.println(nombre + " " + apellidos + " con DNI " + dni + " es menor de edad.");
		}
	}
	
}
