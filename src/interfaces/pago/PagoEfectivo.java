package interfaces.pago;

public class PagoEfectivo implements MetodoPago{
    @Override 
    public void pago(){
        System.out.println("El pago con efectivo se ha realizado correctamente");
    }
}
