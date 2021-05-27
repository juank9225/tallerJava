package ejercicio6;

import ejercicio5.Calcular;

import java.util.ArrayList;

public class ParesImpares{
    ArrayList<Integer> pares = new ArrayList<>();
    ArrayList<Integer> impares = new ArrayList<>();

    public void calcular(){
        for (int i=1;i<=100;i++){
            if(i%2==0){
                pares.add(i);
            }else
                impares.add(i);
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
