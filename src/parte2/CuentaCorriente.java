/*
 * Diseñar la clase CuentaCorriente, que almacena los datos DNI, nombre, saldo y nacionalidad, el cual tendrá 2 valores: 
 * Española y Extranjera. 
 * Añade los siguientes constructores:
 * Con el DNI del titular de la cuenta y un saldo inicial.
 * Con el DNI, nombre y el saldo inicial.
 * Con el DNI, nombre, el saldo inicial y nacionalidad.
 * Añade los getters/setters que consideres oportunos.
 */

package parte2;

//Creación de la clase con sus atributos
public class CuentaCorriente {
	private String dni;
	private String nombre;
	private double saldo;
	private Nacionalidad nacionalidad;
	
	//Enumeramos la nacionalidad
	public enum Nacionalidad {
		Española, Extranjera
	}
	
	//Creación del constructor con el DNI y saldo inicial
	public CuentaCorriente(String dni, double saldo) {
		this(dni, "Desconocido", saldo, Nacionalidad.Española);
	}
	
	//Creación del constructor con el DNI, saldo inicial y nombre
	public CuentaCorriente(String dni, String nombre, double saldo) {
		this(dni, nombre, saldo, Nacionalidad.Española);
	}
	
	//Creación del constructor con todos los datos
	public CuentaCorriente(String dni, String nombre, double saldo, Nacionalidad nacionalidad) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
		this.nacionalidad = nacionalidad;
	}
	
	
	// ----------------- getters -----------------
	public String getDni() {
		return dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}
	
	// ----------------- setters -----------------
	public void setNombre (String nombre) {
		//Si el nombre no es null, está vacío o es "Desconocido", se guarda el valor correctamente
		if (nombre!= null && !nombre.trim().isEmpty() && !nombre.equals("Desconocido")) {
			this.nombre = nombre;
		} else { //Si no es así, mostramos un mensaje de error	
			System.out.println ("ERROR: nombre no válido.");
		}
		
	}
	
	public void setSaldo (double saldo) {
		//Si el saldo es positivo o 0 se guarda el valor 
		if (saldo >= 0) {
			this.saldo = saldo;
		}else { //Si no es así, se muestra un mensaje de error
			System.out.println("ERROR: saldo inválido.");
		}
	}
	
	public void setNacionalidad (Nacionalidad nacionalidad) {
		//Si la nacionalidad es "Española" o "Extranjera" se guarda el valor
		if (nacionalidad != null) {
			this.nacionalidad = nacionalidad;
		} else { //Si no es así, se muestra un mensaje de error
			System.out.println("ERROR: nacionalidad inválida.");
		}
	}
	
	/*
	 * Las operaciones típicas de una cuenta corriente son:
	 * -Sacar dinero: se extraerá una cantidad de dinero introducida por parámetro. Sólo se puede sacar dinero si existe saldo suficiente. 
	 * Si es posible llevar a cabo la operación se resta la cantidad a sacar al saldo de la cuenta y devolverá true. 
	 * En caso contrario, no se podrá sacar dinero y devolverá false.
	 * 
	 * Ingresar dinero: se incrementa el saldo. Hay que comprobar que el saldo a ingresar es una cantidad positiva. 
	 * Devolverá true si se puede llevar a cabo la operación y false en caso contrario.
	 * 
	 * toString: Devuelve una cadena con la información de la cuenta corriente.
	 * 
	 * equals: Dos cuentas corrientes se consideran iguales si coinciden el DNI y el nombre.
	 */
	
	//Creamos un método para sacar dinero
	public boolean sacarDinero (double cantidad) {
		
		//Si la cantidad es menor que el saldo se sacará el dinero correctamente y devolverá true 
		if (cantidad <= saldo && cantidad > 0) {
			//Restamos la cantidad al saldo
			saldo -= cantidad;
			
			//Devolvemos TRUE
			return true;
		}else { //Si no se cumple lo anterior, se devuelve false
			return false;
		}
	}
	
	//Creamos un método para ingresar dinero
	public boolean ingresarDinero (double cantidad) {
		
		//Comprobamos que la cantidad sea positiva
		if (cantidad > 0) {
			//Añadimos la cantidad
			saldo += cantidad;
			
			//Devolvemos True
			return true;
		} else {
			//Si no se cumple lo anterior devuleve false
			return false;
		}
	}
	
	//Creamos un método para mostrar los datos en una cadena
	@Override
	public String toString() {
		String cad = "{Cuenta corriente:" + 
					 "DNI: " + dni + "\n" + 
					 "Nombre: " + nombre + "\n" +
					 "Saldo: " + saldo + "\n" +
					 "Nacionalidad: " + nacionalidad + "}";
		
		//Devolvemos la cadena
		return cad;
	}
	
	//Creamos un método para ver si dos cuentas son iguales
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		if (getClass() != obj.getClass()) return false;

	    CuentaCorriente otra = (CuentaCorriente) obj;
	    return dni.equals(otra.dni) && nombre.equals(otra.nombre);
	}
}
