package interfaces.empleados;

public class Comercial extends Empleado implements Bonificable {

    private double comision=0.0;
    private double salarioFinal=0.0;
    public Comercial(String nombre, double salarioBase, double comision) {
        super(nombre, salarioBase);
        this.comision = comision;
    }
    public double getComision() {
        return comision;
    }
    public void setComision(double comision) {
        this.comision = comision;
    }
    public double getSalarioFinal() {
        return salarioFinal;
    }
    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    @Override 
    public void sumarBonificacion(){
        this.salarioFinal=+getComision();
    }

    @Override 
    public double calcularSalario(){
        sumarBonificacion();
        return this.salarioFinal+=getSalarioBase();
    }
    @Override
    public String toString() {
        return "Comercial [nombre=" + nombre + ", salarioBase=" + salarioBase + ", comision=" + comision
                + ", salarioFinal=" + salarioFinal + "]";
    }

    

    

}
