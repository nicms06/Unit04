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
		
		System.out.println("----------< Persona 1 >----------");
		
		//Pedimos el nombre
		persona1.pedirDatos(sc);
		
		//------------------- PERSONA 1 -------------------
		
		//Creamos el objeto persona2
		Persona persona2 = new Persona();
				
		System.out.println("----------< Persona 2 >----------");
		
		//Pedimos el nombre
		persona2.pedirDatos(sc);
		
		//Mostramos los mensajes finales
		persona1.printMensaje();
		persona2.printMensaje();
		
		//Cerramos el Scanner
		sc.close();
	}

}
