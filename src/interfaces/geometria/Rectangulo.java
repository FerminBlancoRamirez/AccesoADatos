package interfaces.geometria;

public class Rectangulo {

    private double base=0.0;
    private double altura=0.0;

    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Sobreescribimos metodo
    public double area(){
        return getBase()*getAltura();
    }
}
