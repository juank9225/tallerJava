package ejercicio9;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner tex = new Scanner(System.in);
        Transformar transformar = new Transformar();
        System.out.println("de la siguiente frase:");
        System.out.println(transformar.getFrase());
        System.out.println("Cambiaremos las (a) x (e):");
        transformar.cambioPalabras();
        System.out.println("Añadir una frase a la frase inicial.");
        String usu = tex.nextLine();
        transformar.setUsuario(usu);
        transformar.unirFrases();

    }
}
