package Excepciones;

public class ExcepcionIntervalo extends Exception{
    public ExcepcionIntervalo(){
        super("Los valores no se encuentran en el rango permitido");
    }

    public ExcepcionIntervalo(String mensaje){
        super(mensaje);
    }
}
