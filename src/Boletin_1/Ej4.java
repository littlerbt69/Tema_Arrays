package Boletin_1;

import java.util.Random;

public class Ej4 {

    private static final int NUM_REPETICIONES = 6000;
    private static final int MIN_RANDOM = 0;
    private static final int MAX_RANDOM = 100;

    public static void main(String[] args) {
        Random random = new Random();

        int suma = 0;

        int[] terminaciones = new int[10];

        for (int i = 0; i < NUM_REPETICIONES; i++) {
            int aleatorio = random.nextInt(MAX_RANDOM);
            suma += aleatorio;

            terminaciones[aleatorio % 10]++;
        }

        int valorMAX = Integer.MIN_VALUE;

        for (int i = 0; i < terminaciones.length; i++) {
            System.out.println("El nº " + i + " se ha repetido " + terminaciones[i] + " veces. Esto equivale a un " + (double) terminaciones[i]/NUM_REPETICIONES*100 + "% veces.");
        }

        for (int i = 0; i < terminaciones.length; i++) {
            if (terminaciones[i] > valorMAX) {
                valorMAX = terminaciones[i];
            }
        }

        System.out.println(" ");

        for (int i = 0; i < terminaciones.length; i++) {
            if (terminaciones[i] == valorMAX) {
                System.out.println("El digito en el que mas numeros han terminado es: " + i + " con una cantidad de: " + valorMAX);

            }
        }
        System.out.println("La media de los numeros es: " + (double) suma / NUM_REPETICIONES);

        for (int i = 0; i < terminaciones.length; i++) {
            if (terminaciones[i] == 0) {
                System.out.println("No ha habido ningun numero que acabase en: " + i);
            }
        }
    }
}