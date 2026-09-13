package empleados;

import java.util.Scanner;

public class Empleado {

    private String nombre;
    private String DNI;

    public Empleado(){
        this.nombre="";
        this.DNI="";
    }

    public Empleado(String nombre, String DNI){
        this.nombre=nombre;
        this.DNI=DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public void lectura(){
        System.out.println("El nombre del documento es: "+getNombre());
        System.out.println("El numero de DNI es: "+getDNI());
    }

    public void escritura(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime el nombre que quieres introducir en el documento: ");
        String nombre=sc.nextLine();
        System.out.println("Dime el numero de documento: ");
        String DNI=sc.nextLine();
        setDNI(DNI);
        setNombre(nombre);
    }
}
