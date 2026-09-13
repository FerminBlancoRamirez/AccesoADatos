package banco;

public class Tienda {
    //saldo -> private -> no tiene acceso
    //codigo -> default -> tiene acceso
    //oficina -> protected -> no tiene acceso
    //titular -> public -> tiene acceso

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        //puede ejecutarlo
        //el codigo mejoraria heredando Cuenta y pudiendo usar
        //asi tambien los atributos que esten con el modificador 
        //protected
    }

}
