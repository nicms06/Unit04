package crud.gestimal;

import java.util.ArrayList;

public class GestionArticulo {
    private static ArrayList<Articulo> almacen = new ArrayList<>();

    //Constructor
    public GestionArticulo(){
        almacen = new ArrayList<>();
    }

    //Creamos un metodo para listar los artículos
    public void listarArticulos(){
        if (almacen.isEmpty()){ //Si no hay artículos en la lista, mostramos un mensaje.
            System.out.println("El almacén está vacío.");
        } else { //Si hay artículos los mostramos
            for (Articulo a : almacen){ //Recorremos la lista y vamos imprimiendo los artículos
                System.out.println(a);
            }
        }
    }

    //Metodo para dar de alta un producto
    public void darDeAlta (Articulo articulo){
        if (buscarArticulo(articulo.getNombre()) != null){ //Si el artículo no es null mostramos un mensaje
            System.out.println("El artículo ya está dado de alta");
        } else{ //Damos de alta el artículo
            almacen.add(articulo);
            System.out.println("Artículo añadido correctamente.");
        }
    }

    //Metodo para dar de baja un producto
    public void darDeBaja (String nombre){
        Articulo articulo = buscarArticulo(nombre);

        if (buscarArticulo(nombre) == null){ //Si el artículo es null devolveremos un mensaje de error
            System.out.println("El artículo no existe en el almacén.");
        } else{ //Si el producto existe lo eliminamos
            almacen.remove(articulo);
            System.out.println("Artículo eliminado correctamente.");
        }
    }

    //Metodo para modificar un artículo
    public void modificar (String nombre, double precio, int cuantosQuedan){
        Articulo articulo = buscarArticulo(nombre);

        if (articulo == null){ //Si el artículo no se encuentra en la lista, mostramos un mensaje
            System.out.println("El artículo no se encuentra en la lista.");
        } else{ //Si el artículo no se encuentra en la lista, lo editamos
            articulo.setPrecio(precio); //Cambiamos el precio del artículo
            articulo.setCuantosQuedan(cuantosQuedan); //Cambiamos el stock del artículo
        }
    }

    //Metodo para la entrada de la mercancía
    public void entrada (String nombre, int cantidad){
        Articulo articulo = buscarArticulo(nombre); //Buscamos el artículo en la lista

        if (articulo == null){ //Si el artículo no está en la lista mostramos un mensaje
            System.out.println("El artículo no se encuentra en la lista.");
        } else { //Añadimos la mercancía
            int nuevoStock = articulo.getCuantosQuedan() + cantidad; //Sumamos la cantidad
            articulo.setCuantosQuedan(nuevoStock);
            System.out.println("Se han añadido " + cantidad + " unidades. nueva cantidad: " + nuevoStock );
        }
    }

    //Metodo par ala salida de la mercancía
    public void salida (String nombre, int cantidad){
        Articulo articulo = buscarArticulo(nombre);

        if (articulo == null){ //Si el artículo no se encuentra en el almacén mostramos un mensaje
            System.out.println("El artículo no se encuentra en la lista.");
        } else {
            int nuevoStock = articulo.getCuantosQuedan() - cantidad; //Restamos la cantidad
            if (nuevoStock < 0){ //Si el stock queda negativo mostramos un mensaje de error
                System.out.println("No hay suficiente producto.");
            } else { //Si hay suficiente producto asignamos la nueva cantidad
                articulo.setCuantosQuedan(nuevoStock);
                System.out.println("Se han eliminado " + cantidad + " unidades. Nueva cantidad: " + nuevoStock);
            }
        }
    }

    //Función que devuelve si un artículo está en la lista
    private Articulo buscarArticulo(String nombre){
        for (Articulo a : almacen){ //Buscamos el artículo, si lo encontramos devolvemos el artículo y si no devolvemos null
            if (a.getNombre().equalsIgnoreCase(nombre)){
                return a;
            }
        }
        return null;
    }
}
