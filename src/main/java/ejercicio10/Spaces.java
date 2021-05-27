package ejercicio10;

public class Spaces {

    private String frase;

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String espacios(){
        return frase.replaceAll("\\s","");
    }
}
