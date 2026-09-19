package interfaces.notificaciones;

public class ServicioSMS implements ServicioNotificacion {
    @Override
    public boolean validarDestinatario(String destinatario) {
        // Valida que sean dígitos y tenga una longitud básica de teléfono
        return destinatario != null && destinatario.matches("\\+?[0-9]{9,15}");
    }

    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("[SMS] Enviado al número " + destinatario + ": " + mensaje);
    }
}
