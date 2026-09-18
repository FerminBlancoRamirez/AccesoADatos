package interfaces.tickets;

public class Informe implements Resumible {

    private String fecha;
    private String informe;
    private String informeResumido;

    public Informe(String fecha, String informe, String informeResumido) {
        this.fecha = fecha;
        this.informe = informe;
        this.informeResumido = informeResumido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }

    public String getInformeResumido() {
        return informeResumido;
    }

    public void setInformeResumido(String informeResumido) {
        this.informeResumido = informeResumido;
    }

    @Override
    public void resumen() {
        System.out.println(getFecha());
        System.out.println(getInformeResumido());
    }

}
