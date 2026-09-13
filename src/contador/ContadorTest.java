package contador;

public class ContadorTest {
    public static void main(String[] args) {
        System.out.println(Contador.getTotal()); //Saldra 0 ya que el contador esta inicializado en 0
        Contador a = new Contador();
        Contador b = new Contador();
        System.out.println(Contador.getTotal()); // Tras dos sumas el contador sera 2
    }
}
