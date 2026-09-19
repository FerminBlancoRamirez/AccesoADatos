package interfaces.gestor;

import java.util.ArrayList;

public class GestorClientes implements Gestor<Cliente> {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    @Override
    public void añadir(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente añadido correctamente.");
    }

    @Override
    public Cliente buscar(String id) {
        for (Cliente c : clientes) {
            if (c.getId().equalsIgnoreCase(id)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public boolean eliminar(String id) {
        Cliente c = buscar(id);
        if (c != null) {
            clientes.remove(c);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Cliente> listar() {
        return new ArrayList<>(clientes);
    }
}
