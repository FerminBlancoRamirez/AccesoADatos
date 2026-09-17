package interfaces.pago;

public class PagoPaypal implements MetodoPago{
    @Override 
    public void pago(){
        System.out.println("El pago con paypal se ha realizado correctamente");
    }
}


