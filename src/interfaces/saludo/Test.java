package interfaces.saludo;

public class Test {

    public static void main(String[] args) {
        Persona persona = new Persona("Philip J. Fry");

        Robot robot= new Robot("Bender Bending Rodríguez");

        persona.saludar();
        robot.saludar();
    }

}
