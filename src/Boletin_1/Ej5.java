package Boletin_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej5 {

    private static final int MAX_RANDOM = 1000;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("De cuantos tamaños deseas el array:");
        int tamaño = Integer.parseInt(teclado.nextLine());

        int[] arrayAleatorio = arrayAleatorio(tamaño);

        for (int i = 0; i < arrayAleatorio(tamaño).length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + arrayAleatorio(tamaño)[i]);
        }

    }

    public static int[] arrayAleatorio (int tamaño) {
        Random random = new Random();
        int[] array = new int[tamaño];

        //por cada iteracion del for, se añade un numero aleatorio <= 1000 en cada posicion
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(MAX_RANDOM);
        }

        return array;
    }
}
