import javax.swing.*;

public class Ejercicio5 {
    public static void main (String[] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números desea ingresar?"));

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":"));
        }

        int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número que desea buscar:"));

        boolean encontrado = false;
        String resultado = "";

        for (int i = 0; i < n; i++) {

            if (numeros[i] == buscar) {
                encontrado = true;
                resultado += "El número " + buscar + " se encontró en la posición (índice): " + i + "\n";
            }
        }

        if (encontrado) {
            JOptionPane.showMessageDialog(null, resultado);
        } else {
            JOptionPane.showMessageDialog(null, "El número " + buscar + " no fue encontrado en el arreglo.");
        }
    }
}
