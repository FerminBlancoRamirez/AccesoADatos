package interfaces.empleados;

public class EmpleadoFijo extends Empleado{

    private double pluses;
    private double salarioFinal;
    public EmpleadoFijo(String nombre, double salarioBase, double pluses) {
        super(nombre, salarioBase);
        this.pluses = pluses;
    }
    public double getPluses() {
        return pluses;
    }
    public void setPluses(double pluses) {
        this.pluses = pluses;
    }
    public double getSalarioFinal() {
        return salarioFinal;
    }
    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    @Override 
    public double calcularSalario(){
        return this.salarioFinal=salarioBase+pluses;
    }
    @Override
    public String toString() {
        return "EmpleadoFijo [nombre=" + nombre + ", pluses=" + pluses + ", salarioBase=" + salarioBase
                + ", salarioFinal=" + salarioFinal + "]";
    }

    

}
