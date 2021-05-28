package ejercicio12;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Igualdad frases =new  Igualdad();
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la primera palabra \n");
        frases.setPalabra1(in.nextLine());
        System.out.println("ingrese la segunda palabra \n");
        frases.setPalabra2(in.nextLine());
        frases.comparar();
        frases.igualdad();

    }
}
