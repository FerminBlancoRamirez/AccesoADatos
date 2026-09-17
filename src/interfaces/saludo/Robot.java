package interfaces.saludo;

public class Robot implements Saludable{
    
    private String nombreRobot;

    public Robot(String nombreRobot){
        this.nombreRobot=nombreRobot;
    }

    public String getNombreRobot() {
        return nombreRobot;
    }

    public void setNombreRobot(String nombreRobot) {
        this.nombreRobot = nombreRobot;
    }

    //Sobreescribimos los metodos
    @Override 
    public void saludar(){
        System.out.println("El robot de nombre "+getNombreRobot()+" te saluda");
    }
}
