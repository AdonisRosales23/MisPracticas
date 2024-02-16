package guia1;

import javax.swing.*;

public class LecturaParametros {

    public static void main(String[]args){

        LecturaParametros MostrarEdad = new LecturaParametros();

        MostrarEdad.mostrarEdad(28,18);

    }


    public void mostrarEdad(int edad, int edad2){
        System.out.print("Parametro 1:" + edad);
        System.out.print("Parametro 2:" + edad2);
    }


}
