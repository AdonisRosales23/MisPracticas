package guia1;

import java.util.*;
import javax.swing.JOptionPane;

public class InformacionBasicaJP {
    public static void main (String[]args){
        Scanner reader = new Scanner(System.in);

        String nombres;
        String apellido;
        String carrera;
        String edad;

        int edad1;


        nombres = JOptionPane.showInputDialog("Escriba su nombre");
        apellido = JOptionPane.showInputDialog("Escriba su apellido");
        carrera = JOptionPane.showInputDialog("Cual es su carrea");
        edad = JOptionPane.showInputDialog("Digite su edad");

        edad1= Integer.parseInt(edad);

        JOptionPane.showMessageDialog(null, "Informacion personal: \n\n Nombre: \r "  +  nombres +"\n Apellido: \r " + apellido + "\n Carrera: \r " + carrera + "\n Edad: \r " + edad1);
        System.exit(0); 

    }


}
