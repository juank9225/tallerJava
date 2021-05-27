package ejercicio1;

public class Main {
    public static void main(String[] args) {

        int numeroUno = 2;
        int numeroDos =5;

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
