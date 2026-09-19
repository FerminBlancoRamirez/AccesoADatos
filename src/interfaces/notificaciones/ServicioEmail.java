package interfaces.notificaciones;

public class ServicioEmail implements ServicioNotificacion {
    @Override
    public boolean validarDestinatario(String destinatario) {
        return destinatario != null && destinatario.contains("@") && destinatario.contains(".");
    }

    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("[EMAIL] Enviado a <" + destinatario + ">: " + mensaje);
    }
}
