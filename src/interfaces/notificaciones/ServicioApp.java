package interfaces.notificaciones;

public class ServicioApp implements ServicioNotificacion {
    @Override
    public boolean validarDestinatario(String destinatario) {
        // Valida que el ID de usuario de la App no esté vacío
        return destinatario != null && !destinatario.trim().isEmpty();
    }

    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("[APP PUSH] Enviado al usuario (" + destinatario + "): " + mensaje);
    }
}