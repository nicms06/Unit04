package crud.gestimal;

import java.util.Scanner;

public class MainArticulo {
    static void main(String[] args) {
        //Creamos un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        //Llamamos a la función menú
        menu(sc);

        //Cerramos el Scanner
        sc.close();
    }

    //Función para crear el menu
    static void menu(Scanner sc){
        //Creamos un nuevo objeto
        GestionArticulo gestion = new GestionArticulo();

        //Variable de la opción del menu
        int opc;

        do { //Mientras que la opcion sea distinto a 7 se seguirá mostrando
            //Mostramos el menú
            System.out.println("    MENU");
            System.out.println("==============");
            System.out.println("1. Listado");
            System.out.println("2. Dar de Alta");
            System.out.println("3. Dar de Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");

            //Pedimos la opción
            opc = sc.nextInt();
            sc.nextLine(); //Limpiamos el buffer

            switch (opc){
                case 1: //listar
                    gestion.listarArticulos();
                    break;
                case 2: //Dar de alta
                    //Pedimos los datos del artículo
                    System.out.println("Introduce el nombre del artículo que desea dar de alta: ");
                    String nombre = sc.nextLine().trim();
                    if (nombre.isEmpty()) { //Si el nombre está vacío se muestra un mensaje
                        System.out.println("El nombre no puede estar vacío.");
                        break;
                    }
                    System.out.println("Introduce el precio del artículo: ");
                    double precio = sc.nextDouble();
                    sc.nextLine(); //Limpiamos el buffer
                    System.out.println("Introduce el número de stock: ");
                    int stock = sc.nextInt();
                    sc.nextLine(); //Limpiamos el buffer

                    //Añadimos los datos
                    gestion.darDeAlta(new Articulo(nombre, precio, stock));
                    break;
                case 3: //Dar de baja
                    //Pedimos el nombre del artículo que se quiere eliminar
                    System.out.println("Introduce el nombre del artículo que desea dar de baja: ");
                    String nombreEliminar = sc.nextLine();

                    if (nombreEliminar.trim().isEmpty()){ //El nombre no puede estar vacío
                        System.out.println("El nombre del artículo no puede estar vacío.");
                        break;
                    }

                    gestion.darDeBaja(nombreEliminar); //Damos de baja el producto
                    System.out.println("Artículo eliminado correctamente.");
                    break;
                case 4: //Modificar
                    //Pedimos los datos
                    System.out.println("Que artículo desea modificar: ");
                    String nombreModificar = sc.nextLine();
                    if (nombreModificar.trim().isEmpty()){ //El nombre no puede estar vacío
                        System.out.println("El nombre del artículo no puede estar vacío.");
                        break;
                    }
                    System.out.println("Introduce el nuevo precio");
                    double precioNuevo = sc.nextDouble();
                    if (precioNuevo < 0){
                        System.out.println("El precio no puede ser negativo.");
                        break;
                    }
                    sc.nextLine(); //Limpiamos el buffer
                    System.out.println("Introduce la nueva cantidad: ");
                    int cantidadNueva = sc.nextInt();
                    if (cantidadNueva < 0){
                        System.out.println("La cantidad no puede ser negativa.");
                        break;
                    }
                    sc.nextLine(); //Limpiamos el buffer

                    gestion.modificar(nombreModificar, precioNuevo, cantidadNueva); //Modificamos el producto
                    break;
                case 5: //Entrada de mercancía
                    //Pedimos los datos
                    System.out.println("De qué artículo desea añadir mercancía: ");
                    String nombreAdd = sc.nextLine();
                    if (nombreAdd.trim().isEmpty()){ //El nombre no puede estar vacío
                        System.out.println("El nombre del artículo no puede estar vacío.");
                        break;
                    }
                    System.out.println("Introduce la cantidad de producto: ");
                    int productoAdd = sc.nextInt();
                    if (productoAdd < 0){
                        System.out.println("La cantidad no puede ser negativa.");
                        break;
                    }
                    sc.nextLine(); //Limpiamos el buffer

                    gestion.entrada(nombreAdd, productoAdd);  //Añadimos la cantidad
                    break;
                case 6: //Salida de mercancía
                    //Pedimos los datos
                    System.out.println("De qué artículo desea eliminar mercancía: ");
                    String nombreRest = sc.nextLine();
                    if (nombreRest.trim().isEmpty()){ //El nombre no puede estar vacío
                        System.out.println("El nombre del artículo no puede estar vacío.");
                        break;
                    }
                    System.out.println("Introduce la cantidad de producto: ");
                    int productoRest = sc.nextInt();
                    if (productoRest < 0){
                        System.out.println("La cantidad no puede ser negativa.");
                        break;
                    }
                    sc.nextLine(); //Limpiamos el buffer

                    gestion.salida(nombreRest, productoRest);  //Restamos la cantidad
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Introduce un número del 1 al 7.");
            }

        } while (opc != 7);
    }
}






































