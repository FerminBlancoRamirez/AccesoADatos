package libros;

public class PruebaLibro {
    public static void main(String[] args) {
        Libro MiLibro = new Libro();
        MiLibro.NombreAutor = "Frederick Forsyth";
        MiLibro.Titulo = "El manifiesto negro";
        MiLibro.Editorial = "Circulo de lectores";
        MiLibro.TipoPortada = "Dura";

        MiLibro.NumeroDePaginas = 575;
        System.out.println("Nombre: " + MiLibro.NombreAutor);
        System.out.println("Título: " + MiLibro.Titulo);
        System.out.println("Editorial: " + MiLibro.Editorial);
        System.out.println("Pottada: " + MiLibro.TipoPortada);
        System.out.println("Páginas " + MiLibro.NumeroDePaginas);
    }
}
