package interfaces.gestionObjetos;

import java.util.ArrayList;
import java.util.List;

public class Testeo {
    public static void main(String[] args) {
        // Colección de objetos de tipo Gestionable
        List<Gestionable> listaGestionables = new ArrayList<>();

        // Añadimos tanto Productos como Clientes a la misma lista
        listaGestionables.add(new Producto("PROD-001", "Portátil HP"));
        listaGestionables.add(new Cliente("CLI-101", "María López"));
        listaGestionables.add(new Producto("PROD-002", "Ratón Logitech"));
        listaGestionables.add(new Cliente("CLI-102", "Carlos Gómez"));

        System.out.println("--- ACTIVANDO TODOS LOS ELEMENTOS ---");
        // Uso de polimorfismo: recorremos la lista ejecutando sus métodos
        for (Gestionable elemento : listaGestionables) {
            elemento.activar();
        }

        System.out.println("\n--- DESACTIVANDO TODOS LOS ELEMENTOS ---");
        for (Gestionable elemento : listaGestionables) {
            elemento.desactivar();
        }
    }
}
