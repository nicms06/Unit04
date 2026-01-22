package crud;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionAlumnos {
    //Tiene como propiedad la un arraylist del tipo Alumno
    private ArrayList<Alumno> listaAlumnos;

    //Creamos el constructor
    public GestionAlumnos (){
        listaAlumnos = new ArrayList<>();
    }

    //Método para listar alumnos
    public void listarAlumnos() {
        if(listaAlumnos.isEmpty()) { //Si la lista está vacía, se muestra un mensaje
            System.out.println("No hay alumnos en la lista.");
        } else{ //Si hay alumnos en la lista los mostramos
            for (Alumno a : listaAlumnos){
                System.out.println(a);
            }
        }
    }

    //Función que busca alumnos en la lista
    private Alumno buscarAlumno(String nombre){
        for (Alumno a : listaAlumnos){ //Recorremos la lista
            if(a.getNombre().equalsIgnoreCase(nombre)){ //Si se encuentra el nombre, devolvemos al alumno
                return a;
            }
        }
        return null; //Si no encontramos el nombre del alumno no devolvemos nada
    }

    //Metodo para añadir alumnos
    public void addAlumno(Alumno alumno){
        //Buscamos si el alumno está dentro de la lista
        Alumno alumno1= buscarAlumno(alumno.getNombre());

        if (alumno1 == null){ //Si el nombre del alumno es null, añadimos al alumno
            listaAlumnos.add(alumno);
            System.out.println("Alumno añadido correctamente.");
        } else {
            System.out.println("El alumno ya está en la lista.");
        }
    }

    //Metodo para eliminar alumnos
    public void deleteAlumno(String nombre){
        //Buscamos si el alumno está dentro de la lista
        Alumno alumno = buscarAlumno(nombre);

        if (alumno != null){ //Si el alumno se encuentra en la lista lo borramos
            listaAlumnos.remove(alumno);
            System.out.println("Alumno eliminado correctamente.");
        } else { //Si el alumno no se encuentra en la lista mostramos un mensaje
            System.out.println("El alumno no se encuentra en la lista.");
        }
    }

    //Metodo para modificar los alumnos
    public void modificarAlumno(String nombre, int nuevaNota) {
        Alumno alumno = buscarAlumno(nombre);
        if (alumno == null) {
            System.out.println("El alumno no se encuentra en la lista.");
            return;
        }

        if (nuevaNota < 0 || nuevaNota > 10) {
            System.out.println("ERROR: Nota no válida.");
            return;
        }

        alumno.setNota(nuevaNota);
        System.out.println("Nota actualizada correctamente.");
    }
}

















