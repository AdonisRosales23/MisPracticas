import javax.swing.*;
public class SentenciaIF {
    public static void main(String[] args){
        String datos;
        double sueldo, afp=0, isss, totalre, nsueldo, renta = 0;
        datos = JOptionPane.showInputDialog("Ingrese el sueldo del empleado (a)");
        sueldo = Double.parseDouble(datos);
        if(sueldo>300){
            afp = (sueldo*0.0625);
        }
        JOptionPane.showMessageDialog(null, "Este empleado tiene un sueldo de:" +sueldo + "y el descuento de AFP es" + afp);

        datos=(String) JOptionPane.showInputDialog(null, "Ingrese el Sexo:\n Si es Masculino (M) \n Si es Fememinino(F)","Sexo del Empleado", JOptionPane.QUESTION_MESSAGE, null, //Icono por defecto
                new Object[]{ "M", "F"},
                "F");
                if(datos == "M"){
                    isss = sueldo*0.03;
                    totalre = sueldo*0.10;
                    nsueldo = sueldo-totalre;
                    JOptionPane.showMessageDialog(null,"A este empleado se le detiene" + isss + "en concepto de ISSS \n Ademas se le retiene:" + renta+ "En concepto de renta \n Lo que hace un total de:"+totalre+
 "Y su nuevo sueldo es de:"+nsueldo);
                }
    }
}
