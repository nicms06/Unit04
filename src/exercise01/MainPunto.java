/*
 * En el main de la clase principal instancia 3 objetos Punto con las coordenadas (5,0), (10,10) y (-3,7). 
 * Muestra por pantalla sus coordenadas (utiliza un println para cada punto). Modifica todas las coordenadas 
 * (prueba distintos operadores como = + - += *=...) y vuelve a imprimirlas por pantalla.
 */

package exercise01;

public class MainPunto {

	public static void main(String[] args) {
		
		//Instancia del primer objeto
		Punto punto1 = new Punto();
		//Coordenadas del primer punto
		punto1.x = 5;
		punto1.y = 0;
		
		//Instancia del segundo objeto
		Punto punto2 = new Punto();
		//Coordenadas del segundo objeto
		punto2.x = 10;
		punto2.y = 10;
		
		//Instancia del tercer objeto
		Punto punto3 = new Punto();
		//Coordenadas del tercer objeto
		punto3.x = -3;
		punto3.y = 7;
		
		//Mostramos los 3 puntos sin modificarlos 
		System.out.println("-----< Puntos sin modificar >-----");
		System.out.println("Punto 1 = (" + punto1.x + ", " + punto1.y + ")");
		System.out.println("Punto 2 = (" + punto2.x + ", " + punto2.y + ")");
		System.out.println("Punto 3 = (" + punto3.x + ", " + punto3.y + ")");
		
		//Modificamos los valores
		punto1.x += punto2.x;
		punto1.y += punto1.x;
		
		punto2.y -= punto1.y;
		
		punto3.x += 5;
		punto3.y *= 8;
		
		//Mostramos los 3 puntos modificados
		System.out.println("\n-----< Puntos  modificados >-----");
		System.out.println("Punto 1 = (" + punto1.x + ", " + punto1.y + ")");
		System.out.println("Punto 2 = (" + punto2.x + ", " + punto2.y + ")");
		System.out.println("Punto 3 = (" + punto3.x + ", " + punto3.y + ")");
	}

}