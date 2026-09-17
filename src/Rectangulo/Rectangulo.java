package Rectangulo;

public class Rectangulo {
    private int alto=1;
    private int ancho=1;

    public Rectangulo(int alto, int ancho){
        if (alto>0) {
            this.alto=alto;
        }   
        if (ancho>0){
            this.ancho=ancho;
        }
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        if (alto>0) {
            this.alto=alto;
        }
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
       if (ancho>0){
            this.ancho=ancho;
        }
    }

    @Override
    public String toString() {
        return "Rectangulo [alto=" + alto + ", ancho=" + ancho + "]";
    }



    
}
