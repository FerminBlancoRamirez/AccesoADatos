package punto;

public class Punto {
    private int x, y;

    // 1. Constructor por defecto para (0, 0)
    public Punto() {
        this(0, 0);
    }

    // 2. Constructor para coordenadas simétricas (v, v)
    public Punto(int v) {
        this(v, v);
    }

    // 3. Constructor principal para coordenadas indicadas
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Getters
    public int getX() { return x; }
    public int getY() { return y; }

    // Método dibujar
    public void dibujar() {
        System.out.println("Punto en (" + x + ", " + y + ")");
    }
}
