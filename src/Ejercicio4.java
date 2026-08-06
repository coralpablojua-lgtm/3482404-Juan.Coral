import javax.swing.*;

public class Ejercicio4 {
    public static void main (String[] args){

        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas temperaturas desea registrar?"));

        double[] temperaturas = new double[n];

        for (int i = 0; i < n; i++) {
            temperaturas[i] = Double.parseDouble(
                    JOptionPane.showInputDialog("Ingrese la temperatura " + (i + 1) + " en °C:"));
        }


    }
}
