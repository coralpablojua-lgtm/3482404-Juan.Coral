import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Pedir la cantidad de números
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números desea ingresar?"));

        // Crear el arreglo
        int[] numeros = new int[n];

        // Ingresar los números
        for (int i = 0; i < n; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":"));
        }

        // Inicializar el mayor y el menor con el primer número
        int mayor = numeros[0];
        int menor = numeros[0];

        // Recorrer el arreglo para encontrar el mayor y el menor
        for (int i = 1; i < n; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Mostrar resultados
        JOptionPane.showMessageDialog(null,
                "El número mayor es: " + mayor +
                        "\nEl número menor es: " + menor);
    }
}
