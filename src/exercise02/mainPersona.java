/*
 * En el main de la clase principal instancia dos objetos de la clase Persona. 
 * Luego, pide por teclado los datos de ambas personas (guárdalos en los objetos). 
 * Por último, imprime dos mensajes por pantalla (uno por objeto) con un mensaje del estilo 
 * “Azucena Luján García con DNI … es / no es mayor de edad”.
 */

package exercise02;

import java.util.Scanner;

public class mainPersona {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//------------------- PERSONA 1 -------------------
		
		//Creamos el objeto persona1
		Persona persona1 = new Persona();
		
		System.out.print("----------< Persona 1 >----------");
		
		//Pedimos los datos de la persona 1
		pedirnom
		
		//Apellidos
		System.out.print("Introduce los apellidos de " + persona1.nombre + ": ");
		persona1.apellidos = sc.nextLine();
		
		//Edad
		System.out.print("Introduce la edad de " + persona1.nombre + ": ");
		persona1.edad = sc.nextInt();
		
		sc.nextLine();
		
		//DNI
		System.out.print("Introduce el DNI de " + persona1.nombre + ": ");
		persona1.dni = sc.nextLine();
		
		//------------------- PERSONA 1 -------------------
		
		//Creamos el objeto persona2
		Persona persona2 = new Persona();
				
		//Pedimos los datos de la persona 2
		//Nombre
		System.out.print("Introduce el nombre de la segunda persona: ");
		persona2.nombre = sc.nextLine();
				
		//Apellidos
		System.out.print("Introduce los apellidos de " + persona1.nombre + ": ");
		persona2.apellidos = sc.nextLine();
				
		//Edad
		System.out.print("Introduce la edad de " + persona1.nombre + ": ");
		persona2.edad = sc.nextInt();
				
		//DNI
		System.out.print("Introduce el DNI de " + persona1.nombre + ": ");
		persona2.dni = sc.nextLine();
		
		sc.nextLine();
		
		//Cerramos el Scanner
		sc.close();
	}

}
