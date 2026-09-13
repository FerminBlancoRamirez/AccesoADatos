package votacion;

import java.util.ArrayList;

public class VotacionTest {
    public static void main(String[] args) {
        ArrayList<Votacion> votos=new ArrayList<>();
        Votacion Ana=new Votacion("Ana");
        Votacion Bruno=new Votacion("Bruno");
        Votacion Carla=new Votacion("Carla");

        votos.add(Carla);
        votos.add(Ana);
        votos.add(Bruno);

        Ana.votar();
        Bruno.votar();
        Bruno.votar();
        Carla.votar();
        Carla.votar();
        Ana.votar();
        Ana.votar();

        System.out.println(Ana.masVotado(votos));

    }

}
