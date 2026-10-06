package ficheros;

import java.io.Serializable;

public class Estudiante implements Serializable{

    private String nombre;
    private int edad=0;
    private double notaMedia=0.0;
    private transient String contraseña;

    public Estudiante(String nombre, int edad, double notaMedia, String contraseña){
        this.nombre=nombre;
        this.edad=edad;
        this.notaMedia=notaMedia;
        this.contraseña=contraseña;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", notaMedia=" + notaMedia + ", contraseña="
                + contraseña + "]";
    }

    

}
