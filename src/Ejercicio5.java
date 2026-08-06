import javax.swing.*;

public class Ejercicio5 {
    public static void main (String[] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números desea ingresar?"));

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":"));
        }


    }
}
