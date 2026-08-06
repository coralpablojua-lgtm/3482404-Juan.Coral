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

        for (int i = 0; i < n; i++) {

            switch (votos[i]) {
                case "A":
                    votosA++;
                    break;

                case "B":
                    votosB++;
                    break;

                case "C":
                    votosC++;
                    break;
            }
        }

        String ganador;

        if (votosA > votosB && votosA > votosC) {
            ganador = "El ganador es el candidato A.";
        } else if (votosB > votosA && votosB > votosC) {
            ganador = "El ganador es el candidato B.";
        } else if (votosC > votosA && votosC > votosB) {
            ganador = "El ganador es el candidato C.";
        } else {
            ganador = "Hay un empate entre los candidatos con mayor número de votos.";
        }

        String resultado = "RESULTADOS DE LA VOTACIÓN\n\n";
        resultado += "Candidato A: " + votosA + " votos\n";
        resultado += "Candidato B: " + votosB + " votos\n";
        resultado += "Candidato C: " + votosC + " votos\n\n";
        resultado += ganador;

        JOptionPane.showMessageDialog(null, resultado);

    }
}
