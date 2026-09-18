package interfaces.empleados;

public abstract class Empleado {
    protected String nombre;
    protected double salarioBase = 0.0;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public double getSalarioBase() {
        return salarioBase;
    }



    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }



    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", salarioBase=" + salarioBase + "]";
    }

    public abstract double calcularSalario();

}
