package interfaces.geometria;

public class Testeo {
    public static void main(String[] args) {
        Circulo c1= new Circulo(2.5);
        Circulo c2= new Circulo(12.5);

        Rectangulo r1= new Rectangulo(12, 13);
        Rectangulo r2= new Rectangulo(4, 15);

        System.out.println("El area del circulo es: "+c1.area());
        System.out.println("El area del circulo es: "+c2.area());
        System.out.println("El area del rectangulo es: "+r1.area());
        System.out.println("El area del rectangulo es: "+r2.area());
    }

}
