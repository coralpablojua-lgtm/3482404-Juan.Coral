import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos estudiantes hay?"));

        double[] notas = new double[n];

        double suma = 0;
        double promedio;

        for (int i = 0; i < n; i++) {

            do {
                notas[i] = Double.parseDouble(JOptionPane.showInputDialog(
                        "Ingrese la nota del estudiante " + (i + 1) + " (0.0 - 5.0):"));

                if (notas[i] < 0.0 || notas[i] > 5.0) {
                    JOptionPane.showMessageDialog(null,
                            "Error: La nota debe estar entre 0.0 y 5.0");
                }

            } while (notas[i] < 0.0 || notas[i] > 5.0);

            suma += notas[i];
        }

        promedio = suma / n;

        String estado;
        if (promedio >= 3.0) {
            estado = "APROBADO";
        } else {
            estado = "REPROBADO";
        }

        String resultado = "Notas ingresadas:\n\n";

        for (int i = 0; i < n; i++) {
            resultado += "Estudiante " + (i + 1) + ": " + notas[i] + "\n";
        }

        resultado += "\nPromedio del curso: " + String.format("%.2f", promedio);
        resultado += "\nEstado del curso: " + estado;

        JOptionPane.showMessageDialog(null, resultado);
    }
}

