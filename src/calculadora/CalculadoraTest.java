package calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora c1=new Calculadora();
        System.out.println("El resultado de la suma es: "+
            c1.sumar(2, 3)
        );

        System.out.println("El resultado de la suma es: "+
            c1.sumar(2, 3, 4)
        );

        System.out.println("El resultado de la suma es: "+
            c1.sumar(2.5, 3.0)
        );
    }
    
}
