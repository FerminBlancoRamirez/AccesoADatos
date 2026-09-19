package interfaces.gestor;

import java.util.ArrayList;


public class GestorProductos implements Gestor<Producto> {
    private ArrayList<Producto> productos = new ArrayList<>();

    @Override
    public void añadir(Producto producto) {
        productos.add(producto);
        System.out.println("Producto añadido correctamente.");
    }

    @Override
    public Producto buscar(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean eliminar(String codigo) {
        Producto p = buscar(codigo);
        if (p != null) {
            productos.remove(p);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Producto> listar() {
        return new ArrayList<>(productos);
    }
}
