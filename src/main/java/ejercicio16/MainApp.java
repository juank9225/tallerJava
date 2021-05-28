package ejercicio16;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        double peso;
        double altura;
        String sexo;

        System.out.println("Ingresa el nombre de la persona");
        nombre = entrada.nextLine();
        System.out.println("Ingresa la edad de la persona");
        edad = entrada.nextInt();
        System.out.println("Ingresa el sexo de la persona: M para hombre, F para mujer");
        sexo = entrada.next().toUpperCase();
        System.out.println("Ingresa el peso de la persona");
        peso = entrada.nextDouble();
        System.out.println("Ingresa la altura de la persona ejem: 1.80");
        altura = entrada.nextDouble();
        Persona persona1 = new Persona(nombre,edad,peso,altura,sexo);
        persona1.generarDNI();
        Persona persona2 = new Persona("Guillemo Moreno", 65 ,"M");
        persona2.generarDNI();
        Persona persona3 = new Persona();
        persona3.generarDNI();
        persona3.setAltura(1.80);
        persona3.setPeso(85.5);
        persona3.setNombre("John Alexander Gil");
        persona3.setEdad(34);
        persona3.comprobarSexo("M");

        System.out.println("Resultados de "+ persona1.getNombre()+" "+);
        System.out.println("Informacion general "+persona1);
        System.out.println("Resultados de "+ persona2.getNombre()+" "+persona2.medirIMC());
        System.out.println("Informacion general "+persona2);
        System.out.println("Resultados de "+ persona3.getNombre()+" "+persona3.medirIMC());
        System.out.println("Informacion general "+persona3);

    }
}
