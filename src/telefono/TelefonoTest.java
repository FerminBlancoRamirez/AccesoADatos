package telefono;

public class TelefonoTest {
    public static void main(String[] args) {
        Telefono telefono=new Telefono(3);

        telefono.Llamar("111");
        telefono.Llamar("222");
        telefono.Llamar("333");
        telefono.Llamar("444");
        telefono.Llamar("555");
        
        System.out.println(telefono.Llamada(0));
        System.out.println(telefono.Llamada(1));
        System.out.println(telefono.Llamada(2));
        System.out.println(telefono.Llamada(3));
        


    }
}
