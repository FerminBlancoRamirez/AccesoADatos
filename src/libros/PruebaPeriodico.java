package libros;

public class PruebaPeriodico {
    public static void main(String[] args) {
        Periodico2 periodico=new Periodico2();
        periodico.setNombre("La voz de Galicia");
        periodico.setFecha("12-12-2026");
        periodico.setPrecio(0.9f);
        periodico.setNumeroDePaginas(65);

        System.out.println(periodico.getNombre());
        System.out.println(periodico.getFecha());
        System.out.println(periodico.getPrecio());
        System.out.println(periodico.getNumeroDePaginas());
    }
}
