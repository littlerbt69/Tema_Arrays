package Boletin_1;

import java.util.Arrays;

public class Ej10 {

    public static void main(String[] args) {
        // Array con elementos duplicados
        int[] arrayConDuplicados = {1, 2, 3, 4, 2, 5, 6, 1, 3};

        // Llamada a la función para eliminar duplicados
        int[] arraySinDuplicados = eliminarDuplicados(arrayConDuplicados);

        // Imprimir el nuevo array sin duplicados
        System.out.println("Array sin duplicados: " + Arrays.toString(arraySinDuplicados));
    }

    // Función para eliminar duplicados de un array
    public static int[] eliminarDuplicados(int[] arrayConDuplicados) {
        // Ordenar el array para agrupar los elementos duplicados
        Arrays.sort(arrayConDuplicados);

        // Contador para rastrear el tamaño del nuevo array sin duplicados
        int contador = 0;

        // Iterar sobre el array ordenado para contar los elementos únicos
        for (int i = 0; i < arrayConDuplicados.length - 1; i++) {
            if (arrayConDuplicados[i] != arrayConDuplicados[i + 1]) {
                contador++;
            }
        }

        // Último elemento siempre se cuenta
        contador++;

        // Crear el nuevo array sin duplicados
        int[] arraySinDuplicados = new int[contador];

        // Rellenar el nuevo array sin duplicados
        contador = 0;
        arraySinDuplicados[contador] = arrayConDuplicados[0];

        for (int i = 1; i < arrayConDuplicados.length; i++) {
            if (arrayConDuplicados[i] != arrayConDuplicados[i - 1]) {
                contador++;
                arraySinDuplicados[contador] = arrayConDuplicados[i];
            }
        }

        return arraySinDuplicados;
    }
}
