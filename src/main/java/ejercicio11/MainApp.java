package ejercicio11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner tex = new Scanner(System.in);
        Cadena cadena = new Cadena();
        System.out.println("Digite una Palabra");
        String palabra = tex.nextLine();
        cadena.setTexto(palabra);
        cadena.contar();
        cadena.caracteres();
        cadena.bocales();


    }

}
