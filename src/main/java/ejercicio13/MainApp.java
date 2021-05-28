package ejercicio13;

import java.util.Calendar;

public class MainApp {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        System.out.println("la fecha actual es Año "+
                Integer.toString(c1.get(Calendar.YEAR))+
                " Mes "+Integer.toString(c1.get(Calendar.MONTH)+1)+
                " Dia "+Integer.toString(c1.get(Calendar.DATE))+"\n");
        System.out.println("Y la hora es "+
                Integer.toString(c1.get(Calendar.HOUR))+
                " horas con "+
                Integer.toString(c1.get(Calendar.MINUTE))+
                " minutos y "+
                Integer.toString(c1.get(Calendar.SECOND))+
                " segundos ");
    }
}
