package interfaces.notificaciones;

public class Testeo {
    public static void main(String[] args) {
        // 1. Envío mediante Email
        GestorNotificaciones gestor = new GestorNotificaciones(new ServicioEmail());
        gestor.procesarEnvio("alvaroVillaverde@cebem.com", "Tu codigo de verificacion es 1234");
        gestor.procesarEnvio("correo-invalido", "Este mensaje no se enviara");

        System.out.println("---");

        gestor.setServicioNotificacion(new ServicioSMS());
        gestor.procesarEnvio("+34612345678", "Tu pedido ha salido del almacen.");

        System.out.println("---");

        gestor.setServicioNotificacion(new ServicioApp());
        gestor.procesarEnvio("lukas.prez", "Tienes una nueva solicitud de amistad.");
    }
}
