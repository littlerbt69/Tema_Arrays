package Boletin_1;

public class Ej1 {
    public static void main(String[] args) {
        // Definir un array de enteros
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Declarar una variable para almacenar la suma de las posiciones pares
        int sumaPosicionesPares = 0;

        // Recorrer el array y sumar las posiciones pares
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) { // Verificar si la posición es par
                sumaPosicionesPares += array[i]; // Sumar el valor en la posición par
            }
        }

        // Imprimir el resultado
        System.out.println("La suma de las posiciones pares es: " + sumaPosicionesPares);
    }
}
