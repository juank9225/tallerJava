package ejercicio10;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner tex = new Scanner(System.in);
        Spaces borrarEspacios = new Spaces();
        System.out.println("digite una frase con espacios:");
        String frase = tex.nextLine();
        borrarEspacios.setFrase(frase);
        System.out.println("su frase sin espacios es:");
        System.out.println(borrarEspacios.espacios());

    }
}
