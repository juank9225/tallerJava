package ejercicio15;

import javax.swing.*;

public class Opciones {
    public int menu(){
        int opc = 0;
        do{  opc = Integer.parseInt(JOptionPane.showInputDialog(
                "****** GESTION CINEMATOGRAFICA ****** \n"+
                        "1.NUEVO ACTOR \n"+
                        "2.BUSCAR ACTOR \n"+
                        "3.ELIMINAR ACTOR \n"+
                        "4.MODIFICAR ACTOR \n"+
                        "5VER TODOS LOS ACTORES \n"+
                        "6.VER PELICULAS DE LOS ACTORES \n"+
                        "7.VER CATEGORIAS DE LAS PELICULAS DE LOS ACTORES \n"+
                        "8.SALIR"));
        }while (opc <=0 || opc >8);
        return opc;
    }
}
