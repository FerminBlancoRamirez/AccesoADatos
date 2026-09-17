package interfaces.libros;

import java.util.ArrayList;

public class Libros {

    private String nombre;
    private int añoPublicacion=0;
    private boolean prestado;

    public Libros(String nombre, int añoPublicacion, boolean prestado){
        this.nombre=nombre;
        this.añoPublicacion=añoPublicacion;
        this.prestado=prestado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Libros [nombre=" + nombre + ", añoPublicacion=" + añoPublicacion + ", prestado=" + prestado + "]";
    }

    

    

}
