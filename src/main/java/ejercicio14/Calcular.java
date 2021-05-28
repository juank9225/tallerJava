package ejercicio14;

public class Calcular {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void calcular(){
        if (numero<=1000){
            for (int i = numero; i <= 1000; i+=2){
                System.out.print(i+"-");
            }
        }else{System.out.println("El numero sobre pasa el limite");
        }
    }


}
