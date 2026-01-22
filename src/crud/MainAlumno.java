package crud;

import java.util.Scanner;

public class MainAlumno {
    static void main(String[] args) {
        //Creamos un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        do{
            //llamamos a la función
            menu(sc);
        }while (menu(sc) != 5);

        //Cerramos el Scanner
        sc.close();
    }
    //Función del menú
    static int menu(Scanner sc){
        GestionAlumnos gestion = new GestionAlumnos();

        System.out.println("ALUMNOS/AS");
        System.out.println("===================");
        System.out.println("1. Listado.");
        System.out.println("2. Nuevo alumno");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        System.out.println("5. Salir");

        //Pedimos el valor
        int opcion = sc.nextInt();

        //Nos aseguramos de que el valor tiene que estar entre 1 y 5
        switch (opcion){
            case 1:
                gestion.listarAlumnos();
                break;
            case 2:
                System.out.print("Introduce el nombre del alumno: ");
                String nombre = sc.nextLine();
                sc.nextLine();
                System.out.print("Introuce la nota: ");
                int nota = sc.nextInt();
                sc.nextLine();
                gestion.addAlumno(new Alumno(nombre, nota));
                break;
            case 3:
                System.out.print("Nombre del alumno a modificar: ");
                String nombreMod = sc.nextLine();
                System.out.print("Nueva nota (0-10): ");
                int nuevaNota = sc.nextInt();
                sc.nextLine();
                gestion.modificarAlumno(nombreMod, nuevaNota);
                break;
            case 4:
                System.out.print("Nombre del alumno a borrar: ");
                String nombreDel = sc.nextLine();
                gestion.deleteAlumno(nombreDel);
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción inválida.");
        }

        return opcion;
    }
}

































