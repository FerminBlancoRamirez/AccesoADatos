package interfaces.libros;

import java.util.ArrayList;

public interface AccionesLibros {

    public void cuentaPrestados(ArrayList<Libros> libros);

    public void publicacionesAnterioresA(ArrayList<Libros> libros, int año);

}
