package interfaces.notificaciones;

public class GestorNotificaciones {
    private ServicioNotificacion servicioNotificacion;

    
    public GestorNotificaciones(ServicioNotificacion servicioNotificacion) {
        this.servicioNotificacion = servicioNotificacion;
    }

   
    public void setServicioNotificacion(ServicioNotificacion servicioNotificacion) {
        this.servicioNotificacion = servicioNotificacion;
    }

    public void procesarEnvio(String destinatario, String mensaje) {
        if (servicioNotificacion.validarDestinatario(destinatario)) {
            servicioNotificacion.enviarMensaje(destinatario, mensaje);
        } else {
            System.out.println("[ERROR] El destinatario '" + destinatario + "' no es válido para este canal.");
        }
    }
}
