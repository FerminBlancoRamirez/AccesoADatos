package libros;

public class Publicacion3 {

    public int NumeroDePaginas = 0;
    public float Precio = 0f;

    Publicacion3(int NumeroDePaginas) {
        this.NumeroDePaginas=NumeroDePaginas;
    }

    Publicacion3(float Precio){
        this.Precio=Precio;
    }

    Publicacion3(int NumeroDePaginas, float Precio){
        this.NumeroDePaginas=NumeroDePaginas;
        this.Precio=Precio;
    }

    public int getNumeroDePaginas() {
        return NumeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        NumeroDePaginas = numeroDePaginas;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    

}
