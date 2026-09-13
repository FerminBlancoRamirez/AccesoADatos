package figurasGeometricas;

public class Rectangulo {
    private double ancho = 1.0;
    private double alto = 1.0;

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if (ancho > 0.0) {
            this.ancho = ancho;
        }
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        if (alto>2.0) {
            this.alto=alto;
        }
    }

    public double area(double ancho, double alto){
        return ancho*alto;
    }

    public double perimetro(double ancho, double alto){
        return 2*(ancho+alto);
    }

}
