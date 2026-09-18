package vehiculo;

public class Vehiculo {
    protected  String ColorVehiculo;
    protected int NumRuedas;
    protected  int Cilindrada;
    protected  int Potencia;
    
    public Vehiculo(String colorVehiculo, int numRuedas, int cilindrada, int potencia) {
        this.ColorVehiculo = colorVehiculo;
        this.NumRuedas = numRuedas;
        this.Cilindrada = cilindrada;
        this.Potencia = potencia;
    }

    public String getColorVehiculo() {
        return ColorVehiculo;
    }

    public void setColorVehiculo(String colorVehiculo) {
        ColorVehiculo = colorVehiculo;
    }

    public int getNumRuedas() {
        return NumRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        NumRuedas = numRuedas;
    }

    public int getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        Cilindrada = cilindrada;
    }

    public int getPotencia() {
        return Potencia;
    }

    public void setPotencia(int potencia) {
        Potencia = potencia;
    }

    

    
}
