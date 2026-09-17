package interfaces.pago;

import java.util.Scanner;

public class Persona {

    public void escogeMetodoPago() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escoge metodo de pago: ");
        System.out.println("1) Con tarjeta");
        System.out.println("2) Con paypal");
        System.out.println("3) Con efectivo");
        int eleccion = sc.nextInt();
        switch (eleccion) {
            case 1:
                PagoTarjeta p1 = new PagoTarjeta();
                p1.pago();
                break;
            case 2:
                PagoPaypal p2 = new PagoPaypal();
                p2.pago();
                break;
            case 3:
                PagoEfectivo p3 = new PagoEfectivo();
                p3.pago();
            default:
                System.out.println("Eleccion incorrecta");
                break;
        }
        sc.close();
    }

}
