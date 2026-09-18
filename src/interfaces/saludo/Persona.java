package interfaces.saludo;

public class Persona implements Saludable{

    private String nombrePersona;
    
    public Persona(String nombre){
        this.nombrePersona=nombre;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    //Sobreescribimos el metodo de la interfaz
    @Override 
    public void saludar(){
        System.out.println("El humano "+getNombrePersona()+" te saluda");
    }
}
