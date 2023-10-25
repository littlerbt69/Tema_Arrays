package Ejercicios_Prueba;

import java.util.Arrays;

class Ordenado {
    public static void main(String args[]) {

        int[] array = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("El array original es: ");
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        Arrays.sort(array);

        System.out.println("\nEl array ordenado es: ");
        for (int numero : array) {
            System.out.print(numero + " ");
        }
    }
}