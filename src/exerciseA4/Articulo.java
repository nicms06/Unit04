/*
 * Crea un programa con una clase llamada Articulo con los siguientes atributos: 
 * nombre, precio (sin IVA), iva (siempre será 21) y cuantosQuedan 
 * (representa cuántos quedan en el almacén).
 */

package exerciseA4;

//Creamos la clase artículo
public class Articulo {

	//Propiedades de la clase Artículo
	String nombre;
	double precio;
	final int IVA = 21;
	int cuantosQuedan;
	
	//Creamos un constructor para la clase
	public Articulo (String nombre, double precio, int cuantosQuedan ) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.cuantosQuedan = cuantosQuedan;
		
	}
	
	//Creamos otro método para mostrar el resultado
	void mostrarResultado() {
		//Calculamos el precio con el IVA
		double pvp = precio * (1+ (IVA / 100.0));
		
		//Mostramos la información
		System.out.println(nombre + " - Precio: " + precio + "EUR - IVA: " + IVA + "% - PVP: " + pvp + "EUR - Restantes: " + cuantosQuedan);
	}
	
	//Creamos otro método para cambiar los valores del objeto
	void cambiarValores(String nombre, double precio, int cuantosQuedan) {
		this.nombre = nombre;
		this.precio = precio;
		this.cuantosQuedan = cuantosQuedan;
	}
	
}