package punto;

public class PuntoTest {
    public static void main(String[] args) {
        // Uso del constructor 1: (0, 0)
        Punto p1 = new Punto();
        p1.dibujar(); // Salida: Punto en (0, 0)

        // Uso del constructor 2: (v, v)
        Punto p2 = new Punto(5);
        p2.dibujar(); // Salida: Punto en (5, 5)

        // Uso del constructor 3: (x, y)
        Punto p3 = new Punto(4, 6);
        p3.dibujar(); // Salida: Punto en (4, 6)
    }
}
