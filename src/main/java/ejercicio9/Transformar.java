package ejercicio9;

public class Transformar {

    private String frase = "La sonrisa sera la mejor arma contra la trizteza";
    private String remplazar ="a";
    private String por="e";
    private String resultante;
    private String usuario;

    public String getFrase() {
        return frase;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void cambioPalabras(){
        resultante = frase.replace(remplazar,por);
        System.out.println(resultante);
    }

    public void unirFrases(){
        String fraseFinal= resultante+" "+usuario;
        System.out.println(fraseFinal);
    }
}
