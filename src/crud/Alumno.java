package crud;

public class Alumno {
    //Le damos las propiedades a la clase
    private String nombre;
    private int nota;

    //Creamos el constructor
    public Alumno(String nombre, int nota){
        this.nombre = nombre;
        this.nota = nota;
    }

    //getNombre
    public String getNombre(){
        return nombre;
    }

    //getNota
    public int getNota(){
        return nota;
    }

    //setNota
    public boolean setNota(int nota){
        if(nota < 0 || nota > 10){
            return false; // Indica que falló
        }
        this.nota = nota;
        return true; // Indica que se actualizó correctamente
    }

    //toString para mostrar un mensaje con el nombre y la nota
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Nota: " + nota;
    }
}
