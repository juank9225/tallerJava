package ejercicio14;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Calcular sucesion = new Calcular();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero menor a 1000");
        sucesion.setNumero(sc.nextInt());
        sucesion.calcular();
    }
}
