package figurasGeometricas;

public class RectanguloTest {
    public static void main(String[] args) {
        Rectangulo r1=new Rectangulo();
        r1.setAlto(3);
        r1.setAncho(6);
        System.out.println("El area de mi rectangulo es: "+
            r1.area(r1.getAncho(), r1.getAlto())
        );
        System.out.println("El perimetro de mi rectangulo es: "+
            r1.perimetro(r1.getAncho(), r1.getAlto())
        );

        System.out.println("---------------------------------------------------");
        r1.setAlto(-4);
        r1.setAncho(0);
        System.out.println("El area de mi rectangulo es: "+
            r1.area(r1.getAncho(), r1.getAlto())
        );
        System.out.println("El perimetro de mi rectangulo es: "+
            r1.perimetro(r1.getAncho(), r1.getAlto())
        );

        //en este segundo caso como los atributos salen fuera del margen
        //establecido se mantienen en los atributos originales ya introducidos
        // y no se modifican

        System.out.println("------------------------------------------------------");
        Rectangulo r2=new Rectangulo();
        r2.setAlto(15);
        r2.setAncho(20);
        System.out.println("El area de mi rectangulo es: "+
            r2.area(r2.getAncho(), r2.getAlto())
        );
        System.out.println("El perimetro de mi rectangulo es: "+
            r2.perimetro(r2.getAncho(), r2.getAlto())
        );
        //Aunque modifique r1 los atributos de r2 no seran modificados
        //ya que al ser una nueva instancia de la clase "Rectangulo" 
        //this solo señala a los atributos de cada instancia
        

        //Al incrementar que alto solo puede introducir valores
        //mayores a 2.0 el valor inicial tambien deberia modificarse
    }
}
