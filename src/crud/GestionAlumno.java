package crud;

import java.util.ArrayList;

public class GestionAlumno {
	//Tendrá una sola propiedad que será una lista con los alumnos
	private ArrayList<Alumno> listaAlumnos;
	
	//Creamos el constructor de la clase
	public GestionAlumno () {
		listaAlumnos = new ArrayList<>();
	}
	
	//Creamos un método para listar los alumnos
	public void listarAlumnos() {
		if(listaAlumnos.isEmpty()) {//Si listaAlumnos está vacío, mostramos un mensaje
			System.out.println("La lista está vacía");
		}else {
			for (Alumno a : listaAlumnos) { //Si la lista tiene valores, los vamos mostrando uno a uno
				System.out.println(a);
			}
		}
	}
	
	//Creamos otro método para añadir alumnos
	public void addAlumnos(Alumno alumno) {
		//Llamamos a la función buscarAlumno
		if (buscarAlumno(alumno.getNombre()) != null) { //Si el alumno se encuentra dentro de la lista mostramos un mansaje de error
			System.out.println("Error: El alumno ya se encuentra en la lista.");
		}
		else { //Si el alumno no se encuentra dentro de la lista lo metemos
			listaAlumnos.add(alumno);
			System.out.println("Alumno añadido.");
		}
	}
	
	//Método para modificar la nota de un alumno
	public void modificarNota(String nombre, double nota) {
		Alumno alumno = buscarAlumno(nombre);
		
		//Buscamos al alumno por el nombre
		if (alumno != null) { //Si el alumno se encuentra en la lista, actualizamos la nota
			alumno.setNota(nota);
			System.out.println("Nota de " + nombre + " actualizada.");
		}else {//Si el alumno no se encuentra en la lista mostramos un error
			System.out.println("El alumno no se encuentra en la lista");
		}
	}
	
	//Método para borrar a un alumno de la lista
	public void eliminarAlumno() {
		
	}
	
	//Función para buscar a un alumno dentro de la lista
	private Alumno buscarAlumno(String nombre) {
		for (Alumno a : listaAlumnos) {
			if(a.getNombre().equalsIgnoreCase(nombre)) {
				return a;
			}
		}
		return null;
	}
	
}








































