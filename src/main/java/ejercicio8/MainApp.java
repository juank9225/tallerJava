package ejercicio8;

import java.util.Locale;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner tex = new Scanner(System.in);
        Laboral diaLab = new Laboral();
        System.out.println("digite un dia de la semana");
        String dia = tex.nextLine().toLowerCase(Locale.ROOT);
        diaLab.setDia(dia);
        diaLab.diaLaboral();
    }
}
