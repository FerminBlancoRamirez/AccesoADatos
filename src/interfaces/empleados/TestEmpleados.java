package interfaces.empleados;

public class TestEmpleados {
    public static void main(String[] args) {
        EmpleadoFijo e1 = new EmpleadoFijo("Alvaro", 1000, 500);

        e1.calcularSalario();
        System.out.println(e1);

        Comercial c1 = new Comercial("Hector", 700, 300);
        c1.calcularSalario();
        System.out.println(c1);
        
    }

}
