package primerTrimestre.banco.interfaces.notificaciones;

public interface ServicioNotificacion {

    boolean validarDestinatario(String destinatario);
    void enviarMensaje(String destinatario, String mensaje);

}
