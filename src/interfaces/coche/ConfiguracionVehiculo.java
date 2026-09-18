package interfaces.coche;

public interface ConfiguracionVehiculo {

    int velocidadMaxima=120;
    int velocidadMinima=0;

    public void acelerar(int velocidadMas);
    public void frenar(int velocidadMenos);
}
