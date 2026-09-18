package vehiculo;

public class Camion extends Vehiculo {
    private int NumeroDeEjes;

    public Camion(int numeroDeEjes, String ColorVehiculo, int NumRuedas, int Cilindrada, int Potencia) {
        super(ColorVehiculo, NumRuedas, Cilindrada, Potencia);
        this.NumeroDeEjes = numeroDeEjes;
    }

    public int getNumeroDeEjes() {
        return NumeroDeEjes;
    }

    public void setNumeroDeEjes(byte numeroDeEjes) {
        NumeroDeEjes = numeroDeEjes;
    }

    @Override
    public String toString() {
        return "Camion [ColorVehiculo=" + ColorVehiculo + ", NumeroDeEjes=" + NumeroDeEjes + ", NumRuedas=" + NumRuedas
                + ", Cilindrada=" + Cilindrada + ", Potencia=" + Potencia + "]";
    }

    
}
