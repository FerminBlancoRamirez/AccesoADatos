package interfaces.gestionObjetos;

import java.util.ArrayList;

public interface Gestionable extends Identificable{

    public void activar();
    public void desactivar();
    public boolean isActivo();

}
