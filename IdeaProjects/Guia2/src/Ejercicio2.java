import javax.swing.JOptionPane;


public class Ejercicio2 {
    public static void main(String[] args) {
        String color;
        double total;
        double totaldescuento;

        total = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa total de tus compras:"));
        color = (String) JOptionPane.showInputDialog(null, "Felicidades, te ha tocado el numero ganador elige una bolita ", "Sacar bolita", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Bolita1", "Bolita2", "Bolita3"},
                "Bolita1");
        //Esta decision es para saber el descuento
        if (color == "Bolita1") {
            totaldescuento = total - (total*0.10);
            String descuentoDiez = String.format("%.2f",totaldescuento);
            JOptionPane.showMessageDialog(null, "Gracias por participar \n Tu bolita es de color ROJO, por lo que obtienes un 10% de descuento y su total a pagar es:" + descuentoDiez);
        } else if (color == "Bolita2") {
            totaldescuento = total - (total*0.5);
            String descuentocinco = String.format("%.2f",totaldescuento);
            JOptionPane.showMessageDialog(null, "Gracias por participar \n Tu bolita es de color VERDE, por lo que obtienes un 5% de descuento y su total a pagar es:" + descuentocinco);
        } else if (color == "Bolita3") {
            JOptionPane.showMessageDialog(null, "Gracias por participar \n Tu bolita es de color BLANCA, , por lo que obtienes un 0% de descuento y su total a pagar es:" + total);
        }
    }
}
