package ejercicio2;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Digite el numero uno: ");
        int numeroUno = numero.nextInt();
        System.out.println("digite el numero dos: ");
        int numeroDos = numero.nextInt();

        System.out.println("calcular el nuemro mayor entre ("+numeroUno+" , "+numeroDos+")");
        if(numeroUno>numeroDos){
            System.out.println("el numero mayor :"+numeroUno);
        }else if(numeroUno<numeroDos){
            System.out.println("el numero mayor :"+numeroDos);
        }else {
            System.out.println(numeroUno+" es igual a "+numeroDos);
        }
    }
}
