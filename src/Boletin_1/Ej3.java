package Boletin_1;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario la cantidad de elementos en el array
        System.out.print("Introduzca las posiciones que tendrá el array: ");
        int n = sc.nextInt();

        // Crear un array de enteros con el tamaño especificado
        int[] array = new int[n];

        // Pedir al usuario que ingrese los elementos del array
        for (int i = 0; i < n; i++) {
            System.out.print("Introduzca el número " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        // Encontrar el mayor, el menor y calcular la media
        int mayor = array[0];
        int menor = array[0];
        int suma = array[0];
        int repeticionesMayor = 1;
        int repeticionesMenor = 1;

        for (int i = 1; i < n; i++) {
            int numero = array[i];
            suma += numero;

            if (numero > mayor) {
                mayor = numero;
                repeticionesMayor = 1;
            } else if (numero == mayor) {
                repeticionesMayor++;
            }

            if (numero < menor) {
                menor = numero;
                repeticionesMenor = 1;
            } else if (numero == menor) {
                repeticionesMenor++;
            }
        }

        double media = (double) suma / n;

        // Mostrar los resultados
        System.out.println("El mayor número introducido es " + mayor + " (se repite " + repeticionesMayor + " veces)");
        System.out.println("El menor número introducido es " + menor + " (se repite " + repeticionesMenor + " veces)");
        System.out.println("La media de los números introducidos es: " + media);
    }
}
