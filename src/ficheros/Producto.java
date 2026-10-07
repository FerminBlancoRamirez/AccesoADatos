package ficheros;

public class Producto {
    public static final int tamaño = 40; 

    private int id;
    private String nombre;
    private int existencias;
    private double precio;

    public Producto(int id, String nombre, int existencias, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.existencias = existencias;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Existencias: " + existencias + " | Precio: " + precio + "€";
    }
}