package interfaces.coche;

public class Coche implements ConfiguracionVehiculo{

    private String marca;
    private String modelo;
    private int velocidadActual=0;

    public Coche(String marca, String modelo, int velocidadActual){
        this.marca=marca;
        this.modelo=modelo;
        this.velocidadActual=velocidadActual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

        public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
  

    //Sobreescribimos metodos
    @Override 
    public void acelerar(int velocidadMas){
        int velocidad=velocidadMas+getVelocidadActual();
        if (velocidad>velocidadMaxima) {
            setVelocidadActual(velocidadMaxima);
        }else{
            setVelocidadActual(velocidad);
        }
    }

    @Override 
    public void frenar(int velocidadMenos){
        int velocidad=getVelocidadActual()-velocidadMenos;
        if (velocidad<velocidadMinima) {
            setVelocidadActual(velocidadMinima);
        }else{
            setVelocidadActual(velocidad);
        }
    }

    @Override
    public String toString() {
        return "Coche [marca=" + marca + ", modelo=" + modelo + ", velocidadActual=" + velocidadActual + "]";
    }

    



}
