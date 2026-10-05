package ficheros;

/**
 * Crea un programa que cuente las palabras que hay en un archivo de texto.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio2Ficheros {
    public static void main(String[] args) throws IOException {
        File fichero = new File("src\\ficheros\\texto.txt");
        int totalPalabras = 0;
        try{
            Scanner lectura=new Scanner(fichero);
            while (lectura.hasNextLine()) {
                String linea=lectura.nextLine();
                StringTokenizer st=new StringTokenizer(linea);
                totalPalabras+=st.countTokens();
                System.out.println(linea);
            }
            lectura.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("El archivo tiene: "+ totalPalabras );
    }
}
