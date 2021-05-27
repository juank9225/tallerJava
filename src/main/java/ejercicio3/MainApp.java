package ejercicio3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Calcular el Area de un Circulo");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el Area de Circulo");
        double areaCirculo =Double.parseDouble(teclado.nextLine());
        float area = (float) (Math.PI*Math.pow(areaCirculo,2));
        System.out.println("el area del Circulo es :"+area);
    }
}
