package contador;

public class Contador {
    private static int total = 0;
    public static final int MAX = 3;
    
    static {
        System.out.println("Carga");
    }

    public Contador() {
        total++;
    }

    public static int getTotal() {
        return total;
    }
}