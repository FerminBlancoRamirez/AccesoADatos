package interfaces.gestionObjetos;

import java.util.ArrayList;

public class Producto implements Gestionable {

    private String id;
    private String nombre;
    private boolean activo;

    public Producto(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.activo = false; // Inactivo por defecto
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void activar() {
        this.activo = true;
        System.out.println("Producto [" + nombre + " - ID: " + id + "] activado.");
    }

    @Override
    public void desactivar() {
        this.activo = false;
        System.out.println("Producto [" + nombre + " - ID: " + id + "] desactivado.");
    }

    @Override
    public boolean isActivo() {
        return activo;
    }

}
