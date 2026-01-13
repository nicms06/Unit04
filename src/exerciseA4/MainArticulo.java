/*
 * En el main de la clase principal instancia un objeto de la clase artículo. Asígnale valores a todos sus atributos 
 * (los que quieras) y muestra por pantalla un mensaje del estilo “Pijama - Precio:10€ - IVA:21% - PVP:12,1€” (el PVP 
 * es el precio de venta al público, es decir, el precio con IVA). Luego, cambia el precio y vuelve a imprimir el mensaje.
 */

package exerciseA4;

public class MainArticulo {

	public static void main(String[] args) {
		
		//Creamos un objeto de la clase Artículo
		Articulo articulo1 = new Articulo("Pijama", 18.74, 7);
		
		System.out.println("------< Artículo 1 >-----\n");
		
		//Llamamos al método mostrarResultado
		articulo1.mostrarResultado();
		
		//Llamaos al metodo cambiarValores para darle otrs valores al objeto
		articulo1.cambiarValores("Zapatos", 67.99, 12);
		
		System.out.println("\n------< Artículo 2 >-----\n");
		
		//Llamamos al método mostrarResultado
		articulo1.mostrarResultado();
	}

}
