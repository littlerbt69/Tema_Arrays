package Boletin_1;

public class Ej2 {
    public static void main(String[] args) {
        // Definir un array de enteros
        int[] array = {-1, 5, -3, 0, 7, -2, -8, 4, 9, -6};

        // Declarar una variable para contar los números negativos
        int contadorNegativos = 0;

        // Recorrer el array y contar los números negativos
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) { // Verificar si el número es negativo
                contadorNegativos++; // Incrementar el contador de números negativos
            }
        }

        // Imprimir el resultado
        System.out.println("La cantidad de números negativos en el array es: " + contadorNegativos);
    }
}
