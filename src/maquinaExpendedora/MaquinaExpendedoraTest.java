package maquinaExpendedora;

public class MaquinaExpendedoraTest {
    public static void main(String[] args) {
        MaquinaExpendedora m1=new MaquinaExpendedora("Maquina 121212");

        m1.introducirProducto(new Productos("Agua", 1.0, 3));
        m1.introducirProducto(new Productos("Naranja", 0.5, 2));
        m1.introducirProducto(new Productos("Cola", 2.2, 2));

        m1.verProductos();
        m1.retirarProducto();
        m1.pagarCambio(3);
    }
}
