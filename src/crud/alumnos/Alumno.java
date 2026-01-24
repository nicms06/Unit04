package crud.alumnos;

//Creación de una clase alumno
public class Alumno {
	private String nombre;
	private double nota;
	
	//Creamos el constructor 
	public Alumno (String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	
	//Get para devolver el nombre
	public String getNombre() {
        return nombre;
	}
	
	//Get para devolver la nota
	public double getNota() {
        return nota;
	}
	
	//set para nombre
	public void setNombre(String nombre) {
        this.nombre = nombre;
	}
	
	//Set para nota
	public void setNota(double nota) {
		if(nota < 0 || nota > 10) { // si la nota no está entre 0 y 10 se muestra un mensaje de error
			System.out.println("ERROR: Valor no válido.");
		}else { //Si la nota está entre 1 y 10, guardamso el valor
			this.nota = nota;
		}
	}
	
	@Override
	public String toString() {
        return "Nombre: " + nombre + ", Nota: " + nota;
	}

	
}










































