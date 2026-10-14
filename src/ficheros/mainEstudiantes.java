package ficheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class mainEstudiantes {
    public static void main(String[] args) {
        Estudiante e1=new Estudiante("Fermin", 23, 10, "FerminContraseña12");
        System.out.println("Antes de ser guardado: "+e1);

        try{
            ObjectOutputStream objectOutputStream =new ObjectOutputStream(new FileOutputStream("archivo.ser"));
                objectOutputStream.writeObject(e1);
        }catch(IOException e){
            e.printStackTrace();
        }

        try{
            ObjectInputStream ObjectInputStream=new ObjectInputStream(new FileInputStream("archivo.ser"));
            Estudiante recuperado=(Estudiante) ObjectInputStream.readObject();
            System.out.println("Estudiante desde los archivos: "+recuperado);
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

        //Una vez guardes al estudiante su contraseña se vera como null ya que el atributo contraseña al crearse como transient automaticamente es ignorado al ser serializado.
    }
}
