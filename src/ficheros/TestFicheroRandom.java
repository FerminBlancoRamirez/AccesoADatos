package ficheros;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class TestFicheroRandom {

    public static void main(String[] args) {
        String[] nombres = { "Manzana", "Leche Entera", "Pan de Molde", "Aceite Oliva Extra", "Arroz" };
        int[] existencias = { 50, 120, 30, 15, 80 };
        double[] precios = { 1.50, 0.95, 1.25, 8.50, 1.10 };

        GestionProductos gestor = new GestionProductos();
        Scanner sc = new Scanner(System.in);

        try (RandomAccessFile randomAccessFile = new RandomAccessFile("productos.dat", "rw")) {

            gestor.escribirIniciales(randomAccessFile, nombres, existencias, precios);
            System.out.println("Fichero creado y datos cargados.");

            System.out.println("\n--- LISTADO INICIAL ---");
            gestor.mostrarTodos(randomAccessFile);

            System.out.println("\n--- CONSULTA DE PRODUCTO ---");
            int idBusqueda;
            do {
                System.out.print("Introduce ID (1 al 5): ");
                idBusqueda = sc.nextInt();
            } while (idBusqueda < 1 || idBusqueda > 5);

            gestor.mostrarPorId(randomAccessFile, idBusqueda);

            System.out.println("\n--- MODIFICAR EXISTENCIAS ---");
            int idExistencias, nuevasExistencias;
            do {
                System.out.print("Introduce ID (1 al 5): ");
                idExistencias = sc.nextInt();
            } while (idExistencias < 1 || idExistencias > 5);

            do {
                System.out.print("Introduce nuevas existencias (>= 0): ");
                nuevasExistencias = sc.nextInt();
            } while (nuevasExistencias < 0);

            gestor.actualizarExistencias(randomAccessFile, idExistencias, nuevasExistencias);

            System.out.println("\n--- MODIFICAR PRECIO ---");
            int idPrecio;
            double nuevoPrecio;
            do {
                System.out.print("Introduce ID (1 al 5): ");
                idPrecio = sc.nextInt();
            } while (idPrecio < 1 || idPrecio > 5);

            do {
                System.out.print("Introduce nuevo precio (>= 0): ");
                nuevoPrecio = sc.nextDouble();
            } while (nuevoPrecio < 0);

            gestor.actualizarPrecio(randomAccessFile, idPrecio, nuevoPrecio);

            System.out.println("\n--- LISTADO FINAL ---");
            gestor.mostrarTodos(randomAccessFile);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
