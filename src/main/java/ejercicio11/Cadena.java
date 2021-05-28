package ejercicio11;

public class Cadena {
    private int a=0;
    private int e=0;
    private int i=0;
    private int o=0;
    private int u=0;
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void contar(){
        long totalCharacters = texto.chars().filter(ch -> ch != ' ').count();
        System.out.println("El numero total de caracteres es: "+totalCharacters);
    }

    public void caracteres(){
        for (int g = 0;g<texto.length();g++){
            if (texto.charAt(g)=='a') {
                a++;
            }
            if (texto.charAt(g)=='e') {
                e++;
            }
            if (texto.charAt(g) == 'i') {
                i++;
            }
            if (texto.charAt(g) == 'o') {
                o++;
            }
            if (texto.charAt(g) == 'u') {
                u++;
            }
        }
    }

    public void bocales(){
        System.out.println("a : "+a+"\n"+"e : "+e+"\n"+"i : "+i+"\n"+"o : "+o+"\n"+"u : "+u+"\n");
    }

}
