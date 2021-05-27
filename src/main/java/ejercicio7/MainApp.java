package ejercicio7;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        int numero;

        do {
            System.out.println("digite un numero");
            numero = teclado.nextInt();
            if(numero>=0){
                System.out.println("El numero es:"+numero);
            }
        }while (numero<0);
    }
}
