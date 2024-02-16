package guia1;

import java.util.*;

public class InformacionBasica {
    public static void main (String[]args){
        Scanner reader = new Scanner(System.in);
        String nombres;
        String apellidos;
        int edad;
        String carrera;

        System.out.print("Ingrese su nombre:");
        nombres=reader.nextLine();
        System.out.print("Ingrese su apellido:");
        apellidos=reader.nextLine();
        System.out.print("Ingrese su edad:");
        edad=reader.nextInt();
        reader.nextLine();
        System.out.print("Ingrese su Carrera:");
        carrera=reader.nextLine();



        System.out.println("Nombre: "+nombres);
        System.out.println("Apellido: "+apellidos);
        System.out.println("Carrera: "+carrera);
        System.out.println("Edad:"+edad);
    }
}
