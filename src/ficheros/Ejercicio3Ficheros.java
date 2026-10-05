package ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio3Ficheros {
    public static void main(String[] args) {
        String nombreRuta = "parejas_numeros.txt";
        File archivo = new File(nombreRuta);

        if (archivo.exists()) {
            System.out.println("El archivo ya existe. Se añadirán los nuevos datos al final.");
        } else {
            System.out.println("El archivo no existe. Se creará uno nuevo.");
        }

        System.out.println("Ruta del archivo: " + archivo.getAbsolutePath());
        System.out.println("Introduce dos números enteros separados por espacio por línea.");
        System.out.println("Escribe la palabra 'INTRO' para finalizar.\n");

        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter fw = new FileWriter(archivo, true);
            PrintWriter escritor = new PrintWriter(fw);
            while (true) {
                System.out.print("> ");
                String linea = scanner.nextLine().trim();

                if (linea.equalsIgnoreCase("INTRO")) {
                    break;
                }

                String[] partes = linea.split("\\s+");

                if (partes.length == 2) {
                    try {
                        int num1 = Integer.parseInt(partes[0]);
                        int num2 = Integer.parseInt(partes[1]);
                        escritor.println(num1 + " " + num2);
                        escritor.flush();

                    } catch (NumberFormatException e) {
                        System.out.println("Entrada no válida. Los valores deben ser números enteros.");
                    }
                } else {
                    System.out.println("Entrada no válida. Debes introducir exactamente dos números.");
                }
            }

            System.out.println("\nProceso finalizado. Datos guardados en: " + archivo.getAbsolutePath());

        } catch (IOException e) {
            System.err.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        }
    }
}