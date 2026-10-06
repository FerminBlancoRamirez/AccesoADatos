package ficheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class mainEstudiantesLista {
    public static void main(String[] args) {
        ArrayList<Estudiante> lista = new ArrayList<>();

        lista.add(new Estudiante("Lukas", 21, 8, "PorFinEcheNovia21"));
        lista.add(new Estudiante("Alvaro", 21, 7, "ViniciusJrTeAmo"));
        lista.add(new Estudiante("Alejandro", 21, 9, "SoyBajistaPeroMeGustaMasLaGuitarra"));

        System.out.println("--Lista original--");
        for (Estudiante estudiante : lista) {
            System.out.println(estudiante);
        }

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("listaEstudiantes.ser"));
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("listaEstudiantes.ser"));
            ArrayList<Estudiante> listaRecuperada = (ArrayList<Estudiante>) ois.readObject();
            System.out.println("--Lista recuperada--");
            for (Estudiante estudiante : listaRecuperada) {
                System.out.println(estudiante);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
