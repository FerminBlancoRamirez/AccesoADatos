package interfaces.libros;

import java.util.ArrayList;

public class TestLibros {
    public static void main(String[] args) {

        Libreria libreria= new Libreria("Moliere");

        ArrayList<Libros> lista=new ArrayList<>();
        lista.add(new Libros("El imperio final", 2006, false));
        lista.add(new Libros("El pozo de la ascension", 2007, true));
        lista.add(new Libros("Noches Blancas", 1848, false));
        lista.add(new Libros("El alquimista", 1988, true));

        libreria.cuentaPrestados(lista);
        System.out.println("---------------------------------------------------");
        libreria.publicacionesAnterioresA(lista, 1990);
    }

}
