import javax.swing.JOptionPane;
public class Ejercicio1 {
    public static void main(String[] args){
        double nota1;
        double nota2;
        double nota3;
        double notafinal;

         nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa nota 1:"));
         nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa nota 2:"));
         nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa nota 3:"));

        notafinal = (nota1 + nota2 + nota3) / 3;

        if (notafinal > 7){
            JOptionPane.showMessageDialog(null, "Usted aprobo el examen con: " + notafinal);
        }else if(notafinal >= 6.5 && notafinal <= 6.99){
            JOptionPane.showMessageDialog(null, "Usted tiene derecho a realizar examen de reposicion: " + notafinal);
        }else if(notafinal < 7){
            JOptionPane.showMessageDialog(null, "Usted reprobo el examen con: " + notafinal);
        }
        }
    }

