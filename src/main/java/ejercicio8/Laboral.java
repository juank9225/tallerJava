package ejercicio8;

public class Laboral {
    private String dia;

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void diaLaboral(){
        switch (this.dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("el Dia "+dia+" Es laboral");
                break;
            case "domingo":
            case "sabado":
                System.out.println("el Dia "+dia+" No es laboral");
                break;
            default:
                System.out.println("El valor ingresado No es correcto :"+dia);
        }
    }
}
