package vehiculo;

public class PruebaVehiculo {

    public static void main(String[] args) {
Motocicleta MotoBarata1 = new Motocicleta("Rojo", 2, 125, 122, 2);
Motocicleta MotoBarata2 = new Motocicleta("Rojo", 2, 2, 250, 2);
Motocicleta MotoCara = new Motocicleta("Amarillo", 2, 4, 200, 2);
Camion CamionNormal = new Camion(4, "Rojo",  6, 4000, 300);
Camion CamionEnorme = new Camion(24, "Azul", 6,15000, 800);
System.out.println(MotoBarata1.getNumeroDePlazas());
System.out.println(MotoBarata2.getCilindrada());
System.out.println(CamionEnorme.getNumeroDeEjes());
}

}
