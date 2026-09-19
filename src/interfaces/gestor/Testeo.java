package interfaces.gestor;

public class Testeo {
    public static void main(String[] args) {
        Gestor<Producto> gestorProductos = new GestorProductos();
        Gestor<Cliente> gestorClientes = new GestorClientes();

        System.out.println("=== GESTIÓN DE PRODUCTOS ===");
        gestorProductos.añadir(new Producto("P01", "Portátil", 899.99));
        gestorProductos.añadir(new Producto("P02", "Ratón Inalámbrico", 25.50));

        System.out.println("\nLista de Productos:");
        for (Producto p : gestorProductos.listar()) {
            System.out.println(p);
        }

        System.out.println("\nBúsqueda de producto 'P01':");
        Producto prod = gestorProductos.buscar("P01");
        System.out.println(prod != null ? prod : "No encontrado");

        System.out.println("\nEliminando producto 'P02'...");
        gestorProductos.eliminar("P02");

        System.out.println("\nLista actualizada de Productos:");
        for (Producto p : gestorProductos.listar()) {
            System.out.println(p);
        }

        System.out.println("\n=================================");
        System.out.println("=== GESTIÓN DE CLIENTES ===");
        gestorClientes.añadir(new Cliente("C01", "Ana Gómez", "ana@email.com"));
        gestorClientes.añadir(new Cliente("C02", "Carlos Ruiz", "carlos@email.com"));

        System.out.println("\nLista de Clientes:");
        for (Cliente c : gestorClientes.listar()) {
            System.out.println(c);
        }

        System.out.println("\nBúsqueda de cliente 'C01':");
        Cliente cli = gestorClientes.buscar("C01");
        System.out.println(cli != null ? cli : "No encontrado");
    }
}
