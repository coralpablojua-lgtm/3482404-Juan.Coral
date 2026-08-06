import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args){

        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos votos se van a registrar?"));

        String[] votos = new String[n];

        int votosA = 0;
        int votosB = 0;
        int votosC = 0;

        for (int i = 0; i < n; i++) {

            do {
                votos[i] = JOptionPane.showInputDialog(
                        "Ingrese el voto " + (i + 1) + " (A, B o C):").toUpperCase();

                if (!votos[i].equals("A") && !votos[i].equals("B") && !votos[i].equals("C")) {
                    JOptionPane.showMessageDialog(null,
                            "Voto inválido. Solo puede ingresar A, B o C.");
                }

            } while (!votos[i].equals("A") && !votos[i].equals("B") && !votos[i].equals("C"));
        }



    }
}
