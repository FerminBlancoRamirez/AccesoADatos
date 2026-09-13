package repaso.app;

import repaso.modelo.Mensaje;

public class PruebaMensaje {
    public static void main(String[] args) {
        Mensaje mensaje=new Mensaje();

        System.out.println(mensaje.getTexto());
    }
}

//si quitamos el import de repaso.modelo.Mensaje pero ponemos
//el nombre cualificado de la clase podremos seguir ejecutando el
//metodo ya que es un metodo publico
