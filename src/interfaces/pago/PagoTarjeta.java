package interfaces.pago;

public class PagoTarjeta implements MetodoPago{
    @Override 
    public void pago(){
        System.out.println("El pago con tarjeta se ha realizado correctamente");
    }
}
