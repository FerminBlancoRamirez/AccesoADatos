package maquinaExpendedora;

import java.util.ArrayList;
import java.util.Scanner;

public class MaquinaExpendedora {
    private String nombreMaquina;
    private ArrayList<Productos> almacenaje;

    private static final double[] MONEDAS = { 2.0, 1.0, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01 };

    public MaquinaExpendedora(String nombreMaquina) {
        this.nombreMaquina = nombreMaquina;
        this.almacenaje = new ArrayList<>();
    }

    public void introducirProducto(Productos producto) {
        almacenaje.add(producto);
    }

    public void verProductos() {
        for (Productos p : almacenaje) {
            System.out.println(p);
        }
    }

    public void retirarProducto() {
        verProductos();
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIndica qué producto deseas: ");
        String nombreBuscado = scanner.nextLine();

        Productos productoSeleccionado = null;
        for (Productos p : almacenaje) {
            if (p.getNombre().equalsIgnoreCase(nombreBuscado)) {
                productoSeleccionado = p;
                break;
            }
        }

        if (productoSeleccionado == null) {
            System.out.println("Error: Producto no encontrado.");
            return;
        }

        if (productoSeleccionado.getCantidad() <= 0) {
            System.out.println("Error: Producto agotado.");
            return;
        }

        System.out.println("Precio del producto: " + productoSeleccionado.getPrecio() + "€");
        System.out.print("Introduce dinero (€): ");
        double dineroIngresado = scanner.nextDouble();

        if (dineroIngresado < productoSeleccionado.getPrecio()) {
            System.out.println("Dinero insuficiente. Se te devuelven " + dineroIngresado + "€.");
            return;
        }

        productoSeleccionado.setCantidad(productoSeleccionado.getCantidad() - 1);
        System.out.println("¡Compra realizada con éxito! Despachando " + productoSeleccionado.getNombre() + "...");

        double cambioTotal = dineroIngresado - productoSeleccionado.getPrecio();
        pagarCambio(cambioTotal);

    }

    public void pagarCambio(double cambio) {
        if (cambio <= 0) {
            System.out.println("No hay cambio que devolver.");
            return;
        }

        System.out.printf("Tu cambio total es: %.2f€\n", cambio);
        System.out.println("Desglose del cambio (mínimas monedas):");

        int cambioEnCentimos = (int) Math.round(cambio * 100);

        for (double moneda : MONEDAS) {
            int monedaEnCentimos = (int) Math.round(moneda * 100);
            int cantidadMonedas = cambioEnCentimos / monedaEnCentimos;

            if (cantidadMonedas > 0) {
                System.out.printf("- %d moneda(s) de %.2f€\n", cantidadMonedas, moneda);
                cambioEnCentimos %= monedaEnCentimos;
            }
        }
    }
}
