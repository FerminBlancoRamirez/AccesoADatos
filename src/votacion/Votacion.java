package votacion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Votacion {
    private String nombre;
    private int votos=0;
    private String nombreMasVotado;
    

    public Votacion(String nombre){
        this.nombre=nombre;
    }

    public void votar(){
        this.votos++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVotos() {
        return votos;
    }

    public String getNombreMasVotado() {
        return nombreMasVotado;
    }

    public Votacion masVotado(ArrayList<Votacion> votados){
        Votacion masVotado=Collections.max(votados, Comparator.comparingInt(Votacion::getVotos));
        return masVotado;
    }

    @Override
    public String toString() {
        return "Votacion [nombre=" + nombre + ", votos=" + votos + "]";
    }

    

}
