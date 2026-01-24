package crud.gestimal;

public class Articulo {
    //Creamos las propiedades del artículo
    private String nombre;
    private double precio;
    private int cuantosQuedan;

    //Creamos el constructor
    public Articulo(String nombre, double precio, int cuantosQuedan){
        this.nombre = nombre;
        this.precio = precio;
        this.cuantosQuedan = cuantosQuedan;
    }

    // ------------------------------- GET -------------------------------
    //getNombre
    public String getNombre(){
        return nombre;
    }

    //getPrecio
    public double getPrecio(){
        return precio;
    }

    //get cuantosQuedan
    public int getCuantosQuedan(){
        return cuantosQuedan;
    }
    // ------------------------------- SET -------------------------------
    //setNombre
    public void setNombre (String nombre){
        if (nombre == null || nombre.trim().isEmpty()) { //Nos aseguramos de que el nombre no está vacío
            System.out.println("El nombre no puede estar vacío.");
        } else{ //Guardamos el nombre
            this.nombre = nombre.trim();
        }
    }

    //setPrecio
    public void setPrecio (double precio){
        if (precio < 0){ //El precio no puede ser negativo
            System.out.println("El precio no puede ser negativo.");
        } else { //Guardamos el precio
            this.precio = precio;
        }
    }

    //setCuantosQuedan
    public void setCuantosQuedan (int cuantosQuedan){
        if (cuantosQuedan < 0){ //El stock no puede ser negativo
            System.out.println("El stock no puede ser negativo.");
        } else { //Guardamos el stock
            this.cuantosQuedan = cuantosQuedan;
        }
    }

    @Override
    public String toString(){
        return "Producto: " + nombre + " | " + "Precio: " + precio + " | " + "Stock: " + cuantosQuedan;
    }
}