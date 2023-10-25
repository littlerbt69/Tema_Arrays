package Boletin_1;

import java.util.Random;
import java.util.Scanner;

public class Ej6_Aleatorio {

    private static final int MAX_RANDOM = 10;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedir al usuario que ingrese los elementos del array
        System.out.println("Introduce los elementos del array:");
        int tamaño = Integer.parseInt(teclado.nextLine());

        int[] arrayAleatorio = arrayAleatorio(tamaño);

        // Pedir al usuario el elemento a buscar
        System.out.println("Introduce el elemento a buscar: ");
        int elementoABuscar = teclado.nextInt();

        // Verificar si el elemento a buscar se encuentra en el array
        boolean encontrado = false;
        for (int i = 0; i < arrayAleatorio.length; i++) {
            if (arrayAleatorio[i] == elementoABuscar) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El número " + elementoABuscar + " se encuentra en el array.");
        } else {
            System.out.println("El número " + elementoABuscar + " no se encuentra en el array.");
        }

        System.out.println(" ");

        for (int i = 0; i < arrayAleatorio.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + arrayAleatorio[i]);
        }
    }

    public static int[] arrayAleatorio(int tamaño) {
        Random random = new Random();
        int[] array = new int[tamaño];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(MAX_RANDOM);
        }

        return array;
    }
}
