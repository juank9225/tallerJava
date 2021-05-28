package ejercicio18;

public class Serie implements Entregable{
    private String titulo;
    private int numeroTemporadas =3;
    private boolean entregado = false;
    private String genero;
    private String creador;

    public Serie() {

    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
@Override
    public String toString() {
        return "Titulo='" + titulo + '\'' +
                ", Numero de Temporada=" + numeroTemporadas +
                ", Entregado=" + entregado +
                ", Genero=" + genero +
                ", Creador=" + creador;
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
        boolean valor;
        if(this.getNumeroTemporadas() > ((Serie)a).getNumeroTemporadas()){
            valor = true;
        }
        else{
            valor = false;
        }
        return valor;
    }
}
