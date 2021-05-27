package ejercicio4;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Calcular el Precio de un Producto");
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite el Precio del Producto: ");
        double precio = valor.nextDouble();
        double valorTotal = precio+(precio*0.21);
        System.out.println("El precio del producto mas IVA es: "+valorTotal);

    }
}
