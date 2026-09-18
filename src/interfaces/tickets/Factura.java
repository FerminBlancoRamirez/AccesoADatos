package interfaces.tickets;

public class Factura implements Imprimible, Resumible{

    private String fecha;
    private double aPagar=0.0;
    private String concepto;

    public Factura(String fecha, double aPagar, String concepto){
        this.fecha=fecha;
        this.aPagar=aPagar;
        this.concepto=concepto;
    }

    

    public String getFecha() {
        return fecha;
    }



    public void setFecha(String fecha) {
        this.fecha = fecha;
    }



    public double getaPagar() {
        return aPagar;
    }



    public void setaPagar(double aPagar) {
        this.aPagar = aPagar;
    }



    public String getConcepto() {
        return concepto;
    }



    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }



    @Override 
    public void resumen(){
        System.out.println("A pagar: "+getaPagar());
    }

    @Override 
    public void imprimir(){
        System.out.println("Concepto: "+getConcepto());
        System.out.println("Fecha: "+getFecha());
        System.out.println("A pagar: "+getaPagar());
    }
}
