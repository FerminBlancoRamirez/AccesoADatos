package interfaces.tickets;

public class Test {
    public static void main(String[] args) {
        Factura f1=new Factura("18-09-2026", 22.5, "raton");
        f1.resumen();
        f1.imprimir();
        
        System.out.println("-----------------------------------------------------------");
        Informe i1=new Informe("18-09-2026", "Crea las interfaces Imprimible y Resumible. La primera permitirá mostrar toda la información de un objeto y la segunda obtener un resumen. Crea una clase Factura que implemente ambas interfaces y una clase Informe que implemente solamente Imprimible. Comprueba las operaciones que pueden realizarse mediante variables de cada tipo de interfaz.",
         "Crea dos interfaces para dos clases que impriman y resuman");
         i1.resumen();
    }
    

}
