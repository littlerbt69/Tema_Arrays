package Boletin_1;

import java.util.Arrays;

public class Ej12 {
    public static void main(String[] args) {
        // Ejemplo de array desordenado
        int[] arrayDesordenado = {5, 2, 9, 1, 5, 6};

        // Ordenar el array y mostrar el resultado
        ordenarBurbuja(arrayDesordenado);
        System.out.println("Array ordenado: " + Arrays.toString(arrayDesordenado));
    }

    public static void ordenarBurbuja(int[] array) {
        boolean intercambio;

        // Iterar a través del array
        for (int i = 0; i < array.length - 1; i++) {
            intercambio = false;

            // Últimos i elementos ya están ordenados, no necesitan ser comparados
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambiar si están en el orden incorrecto
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    intercambio = true;
                }
            }

            // Si no hay intercambios en esta pasada, el array ya está ordenado
            if (!intercambio) {
                break;
            }
        }
    }
}
