package ejercicio18;

public class VideoJuego implements Entregable{
    private String titulo;
    private int horasEstimadas =10;
    private boolean entregado = false;
    private String genero;
    private String compañia;

    public VideoJuego() {
    }

    public VideoJuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public VideoJuego(String titulo, int horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }
    @Override
    public String toString() {
        return "Titulo='" + titulo + '\'' +
                ", Horas estimadas=" + horasEstimadas +
                ", Entregado=" + entregado +
                ", Genero=" + genero +
                ", Compañia=" + compañia;
    }

    @Override
    public void entregar() {
        this.entregado=true;
    }

    @Override
    public void devolver() {
        this.entregado=false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public boolean compareTo(Object a) {
        boolean returnValue;

        if(this.horasEstimadas > ((VideoJuego)a).horasEstimadas){
            returnValue = true;
        }else{
            returnValue = false;
        }
        return returnValue;
    }
}
