package crud.alumnos;

import java.util.Scanner;

public class MainAlumno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu(sc);
        sc.close();
    }

    static void menu(Scanner sc) {
        GestionAlumno gestion = new GestionAlumno();
        int opc;

        do {
            System.out.println("\nALUMNOS/AS");
            System.out.println("====================");
            System.out.println("1. Listar.");
            System.out.println("2. Nuevo Alumno.");
            System.out.println("3. Modificar.");
            System.out.println("4. Borrar.");
            System.out.println("5. Salir.");
            System.out.print("Introduce una opción: ");

            // Validamos que el usuario ingrese un número
            while (!sc.hasNextInt()) {
                System.out.println("Opción inválida. Introduce un número del 1 al 5.");
                sc.next(); // Limpiamos entrada inválida
            }
            opc = sc.nextInt();
            sc.nextLine(); // Limpiamos el buffer para leer Strings correctamente

            switch (opc) {
                case 1:
                    gestion.listarAlumnos();
                    break;
                case 2:
                    System.out.print("Nombre del alumno: ");
                    String nombre = sc.nextLine().trim();
                    if(nombre.isEmpty()) {
                        System.out.println("ERROR: El nombre no puede estar vacío.");
                        break;
                    }

                    System.out.print("Nota del alumno: ");
                    double nota = leerDouble(sc);

                    gestion.addAlumnos(new Alumno(nombre, nota));
                    break;
                case 3:
                    System.out.print("Nombre del alumno a modificar: ");
                    String nombreMod = sc.nextLine().trim();
                    if(nombreMod.isEmpty()) {
                        System.out.println("ERROR: El nombre no puede estar vacío.");
                        break;
                    }

                    System.out.print("Nueva nota del alumno: ");
                    double notaMod = leerDouble(sc);

                    gestion.modificarNota(nombreMod, notaMod);
                    break;
                case 4:
                    System.out.print("Nombre del alumno que desea eliminar: ");
                    String nombreEliminar = sc.nextLine().trim();
                    if(nombreEliminar.isEmpty()) {
                        System.out.println("ERROR: El nombre no puede estar vacío.");
                        break;
                    }

                    gestion.eliminarAlumno(nombreEliminar);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Introduce un número del 1 al 5.");
            }

        } while (opc != 5);
    }

    // Método auxiliar para leer un double de manera segura
    static double leerDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Valor inválido. Introduce un número válido:");
            sc.next(); // Limpiamos entrada inválida
        }
        double valor = sc.nextDouble();
        sc.nextLine(); // Limpiamos buffer para la siguiente lectura
        return valor;
    }
}
