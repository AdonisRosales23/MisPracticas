package guia1;

import javax.swing.JOptionPane;
public class SumaEnteros {
    public static void main(String[]args){
        String primernumero;
        String segundonumero;

        int numero1;
        int numero2;
        int suma;

        numero1 = Integer.parseInt(primernumero = JOptionPane.showInputDialog("Digite el primer numero"));
        if (numero1  >0){
            numero2 = Integer.parseInt(segundonumero = JOptionPane.showInputDialog("Digite el segundo numero"));
            if (numero2  >0){
                suma = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "La suma es:" + suma, "Resultado",JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }else {
                JOptionPane.showMessageDialog(null, "NO PUEDES INGRESAR NUMEROS NEGATIVOS");
            }
        }else {
            JOptionPane.showMessageDialog(null, "NO PUEDES INGRESAR NUMEROS NEGATIVOS");
        }
    }
}
