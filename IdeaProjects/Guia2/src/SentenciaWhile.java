import javax.swing.*;
import java.nio.channels.ScatteringByteChannel;

public class SentenciaWhile {
        public static void main(String[] args)
        {
            String leer;
            double sueldo = 0, mayor=0,menor=10000;
            int i=1, contador=0;
            StringBuilder detallesEmpleados = new StringBuilder();


            while(i<=5)
            {
                leer= JOptionPane.showInputDialog("Ingrese el Sueldo del Empleado" + i);
                sueldo= Double.parseDouble(leer);

                if (sueldo < 0){
                    JOptionPane.showMessageDialog(null, "Ingrese un numero que sea positivo");
                    i=i-1;
                }
                else {

                detallesEmpleados.append("Empleado").append(i).append(":$").append(sueldo).append("\n");

                if(sueldo>300)
                    contador++;
                if(sueldo>mayor)
                    mayor=sueldo;
                if(sueldo<menor)
                    menor=sueldo;



}
                i++;
            }

            JOptionPane.showMessageDialog(null,
                    "Detalles de los empleados:\n" + detallesEmpleados.toString() +
                            "\nEl sueldo mayor es de $:" + mayor +
                            "\nEl sueldo Menor es de $: " + menor +
                            "\n" + contador + "Empleados tienen un sueldo mayor de $300");
}
}

