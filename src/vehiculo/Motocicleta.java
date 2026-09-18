package vehiculo;

public class Motocicleta extends Vehiculo {
    private int NumeroDePlazas;

    public Motocicleta(String ColorVehiculo, int NumRuedas, int Cilindrada, int Potencia, int NumeroDePlazas) {
        super(ColorVehiculo, NumRuedas, Cilindrada, Potencia);
        this.NumeroDePlazas = NumeroDePlazas;
    }

    public int getNumeroDePlazas() {
        return NumeroDePlazas;
    }

    public void setNumeroDePlazas(byte numeroDePlazas) {
        NumeroDePlazas = numeroDePlazas;
    }

    @Override
    public String toString() {
        return "Motocicleta [ColorVehiculo=" + ColorVehiculo + ", NumeroDePlazas=" + NumeroDePlazas + ", NumRuedas="
                + NumRuedas + ", Cilindrada=" + Cilindrada + ", Potencia=" + Potencia + "]";
    }

    

}
