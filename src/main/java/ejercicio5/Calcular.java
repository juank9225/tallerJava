package ejercicio5;

import java.util.ArrayList;

public class Calcular {
    ArrayList<Integer> pares = new ArrayList<>();
    ArrayList<Integer> impares = new ArrayList<>();

    public void calcular(){
        int i=1;
        while (i<=100){
            if(i%2==0){
                pares.add(i);
            }else {
                impares.add(i);
            }
            i++;
        }
    }

    public void mostrarPares(){
        for (int par:pares){
            System.out.print(par+",");
        }
        System.out.println("");
    }

    public void mostrarImpares(){
        for (int imp:impares){
            System.out.print(imp+",");
        }
        System.out.println("");
    }
}
