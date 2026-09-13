package empleados;

public class EmpleadoTest {
    public static void main(String[] args) {
        Empleado e1=new Empleado();
        e1.escritura();
        e1.lectura();
        Empleado e2=new Empleado("Juan", "363636363B");
        e2.lectura();
        e2.escritura();
        e2.lectura();
    }

}
