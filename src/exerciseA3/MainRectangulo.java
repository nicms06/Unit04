/*
 * En el main de la clase principal instancia 2 objetos Rectangulo en (0,0)(5,5) y (7,9)(2,3). 
 * Muestra por pantalla sus coordenadas, perímetros (suma de lados) y áreas (ancho x alto). 
 * Modifica todas las coordenadas como consideres y vuelve a imprimir coordenadas, perímetros y áreas.
 */
package exerciseA3;

public class MainRectangulo {

	public static void main(String[] args) {
		
		//Creamos el objeto rectangulo1 con sus coordenadas
		Rectangulo rectangulo1 = new Rectangulo(0, 0, 5, 5);
		
		System.out.println("-----< Rectángulo 1>-----\n");
		
		//Llamamos al método "mostrar"
		rectangulo1.mostrar();
		
		System.out.println("\n-----< Rectángulo 2>-----\n");
		
		//Creamos el objeto rectangulo2
		Rectangulo rectangulo2 = new Rectangulo(7, 9, 2, 3);
		
		//Llamamos al método "mostrar"
		rectangulo2.mostrar();
		
		//Cambiamos las coordenadas
		rectangulo1.cambiarCoordenadas(3, 8, 9, 1);
		rectangulo2.cambiarCoordenadas(7, 2, 9, 6);
		
		//volvemos a mostrar los resultados
		System.out.println("\n-----< Rectángulo 1 Editado>-----\n");
		
		//Llamamos al método "mostrar"
		rectangulo1.mostrar();
		System.out.println("\n-----< Rectángulo 2 Editado>-----\n");
		
		//Llamamos al método "mostrar"
		rectangulo2.mostrar();
	}

}
