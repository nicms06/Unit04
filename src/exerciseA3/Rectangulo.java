/*
 * Crea un programa con una clase llamada Rectangulo 
 * que representará un rectángulo mediante dos coordenadas 
 * (x1,y1) y (x2,y2) en un plano, por lo que la clase 
 * deberá tener cuatro atributos enteros: x1, y1, x2, y2.
 */

package exerciseA3;

public class Rectangulo {

	int x1;
	int y1;
	int x2;
	int y2;
	
	// Constructor: se llama al crear el objeto y asigna coordenadas
    public Rectangulo(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
	
	//Método para mostrar los datos
	void mostrar() {
		//calculamos el alto y el ancho
		int ancho = Math.abs(x2 - x1);
		int alto = Math.abs(y2 - y1);
		
		//Calculamos el area y el perímetro
		int area = ancho * alto;
		int perimetro = 2*(alto + ancho);
		
		//Mostramos las coordenadas, el área, y el perímetro
		System.out.println("Coordenadas = (" + x1 + "," + y1 + ")" + " (" + x2 + "," + y2 + ")");
		System.out.println("Perimetro = " + perimetro);
		System.out.println("Area = " + area);
	}
	
	//Método para cambiar las coordenadas
	void cambiarCoordenadas(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
	}
	
	
	
}
