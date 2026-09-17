package interfaces.geometria;

public class Circulo implements Calculable{

    private double radio=0.0;
    private final double PI=3.1416;

    public Circulo(double radio){
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Sobreescribimos metodos
    public double area(){
        return PI*(Math.pow(getRadio(), 2));
    }

}
