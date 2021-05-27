package ejercicio6;

import ejercicio5.Calcular;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("Mostrar numeros pares e impares con ciclo flor");
        ParesImpares numeros = new ParesImpares();
        numeros.calcular();
        System.out.println("Numeros Pares: ");
        numeros.mostrarPares();
        System.out.println("Numeros Impares:");
        numeros.mostrarImpares();
    }
}
