package interfaces.gestor;

import java.util.List;

// Interfaz genérica con parámetro de tipo T
public interface Gestor<T> {
    void añadir(T elemento);
    T buscar(String criterio);
    boolean eliminar(String criterio);
    List<T> listar();
}
