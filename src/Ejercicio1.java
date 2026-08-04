import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args){

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una cantidad de numeros deseada"));

        int [] numero =new int[n];

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < n; i++){
            numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero" + (i + 1) + ":"));
        }

        String resultado = "Clasificacion de los numeros: \n\n";

        for(int i = 0; i < n; i++){
            if (numero[i] % 2 == 0){
                resultado += numero[i] + "El numero es par\n";
                pares++;
            }else{
                resultado += numero[i] + "El numero es impar\n";
                impares++;
            }
        }

        resultado += "\nEl total de numeros pares es:" + pares;
        resultado += "\nEl total de numeros impares es:" + impares;
        JOptionPane.showMessageDialog(null, resultado);

    }
}
