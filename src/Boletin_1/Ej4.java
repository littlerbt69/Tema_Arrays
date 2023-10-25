package Boletin_1;

import java.util.Random;

public class Ej4 {

    final int NUMEROS_TOTALES = 6000;

    int[] arrayRandom = new int[NUMEROS_TOTALES];
    int[] cuentaDigitos = new int[10];

    Random random = new Random();

    for (int i = 0; i < NUMEROS_TOTALES; i++) {
        int numeroAleatorio = random.nextInt(101);
        arrayRandom[i] = numeroAleatorio;
        int ultimoDigito = numeroAleatorio % 10;
        cuentaDigitos[ultimoDigito]++;
    }
}
