package ejercicio5;


import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {

        Calcular numeros = new Calcular();
        numeros.calcular();
        System.out.println("Numeros Pares: ");
        numeros.mostrarPares();
        System.out.println("Numeros Impares:");
        numeros.mostrarImpares();
    }
}
