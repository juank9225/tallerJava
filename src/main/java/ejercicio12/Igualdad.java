package ejercicio12;

public class Igualdad {

    private String palabra1;
    private String palabra2;
    private int Ls, Li, Pc;
    private boolean result;

    public void setPalabra1(String palabra1) {
        this.palabra1 = palabra1;
    }

    public void setPalabra2(String palabra2) {
        this.palabra2 = palabra2;
    }

    public void comparar(){
        if (palabra1.length() < palabra2.length()) {
            Li = palabra1.length();
            Ls = palabra2.length();
            Pc = 1;
        } else {
            Li = palabra2.length();
            Ls = palabra1.length();
            Pc = 2;
        }
    }

    public void igualdad(){
        for (int i = 0; i < Ls; i++) {
            if (i < Li) {
                result = palabra1.substring(i, i + 1).equals(palabra2.substring(i, i + 1));
                if (result == true) {
                    System.out.println("las letras " + palabra1.charAt(i) + " son iguales");
                } else {
                    System.out.println("la letra " + palabra1.charAt(i) + " y la letra " + palabra2.charAt(i) + " no son iguales" + "\n");
                }
            } else {
                System.out.println("la palabra " + Pc + " no tiene la letra " + (i + 1) +" : "+palabra1.charAt(i) + "\n");
            }
        }
    }
}
