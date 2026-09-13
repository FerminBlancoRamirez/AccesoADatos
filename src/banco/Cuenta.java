package banco;

public class Cuenta {
    private double saldo=0.0;
    int codigo=0;
    protected String oficina;
    public String titular;

    //saldo -> private -> tiene acceso
    //codigo -> default -> tiene acceso
    //oficina -> protected -> tiene acceso
    //titular -> public -> tiene acceso

    //Protected asegura que una subclase externa al paquete distinto
    //al de la clase madre solo podra acceder a el mediante herencia
    //usando this.

    Cuenta(){}

    //de los cuatro modificadores el que se podria usar en un clase
    //de nivel superior es public
}
