package interfaces.coche;

public class testeoCoche {
    public static void main(String[] args) {
        Coche c1= new Coche("Peugeot", "307", 70);

        c1.acelerar(60);
        System.out.println(c1);
        c1.frenar(30);
        System.out.println(c1);
        c1.frenar(100);
        System.out.println(c1);
    }

}
