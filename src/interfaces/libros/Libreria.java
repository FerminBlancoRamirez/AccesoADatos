package interfaces.libros;

import java.util.ArrayList;

public class Libreria implements AccionesLibros {

    private String nombre;

    public Libreria(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Ahora implementamos los metodos de la interfaz
    @Override 
    public void cuentaPrestados(ArrayList<Libros> lista){
        System.out.println("Los libros que estan actualmente prestados son: ");
        for(Libros l:lista){
            if (l.isPrestado()==true) {
                System.out.println(l);
            }
        }
    }

    @Override 
    public void publicacionesAnterioresA(ArrayList<Libros> lista, int año){
        System.out.println("Los libros que se publicaron antes del año "+año+" son: ");
        for(Libros l: lista){
            if(l.getAñoPublicacion()<año){
                System.out.println(l);
            }
        }
    }
}
