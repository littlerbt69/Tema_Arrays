package Boletin_1;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Hasta qué número quieres calcular las tablas de multiplicar?: ");
        int numero = scanner.nextInt();

        int[][] tablaMultiplicar = new int[numero][10];

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= 10; j++) {
                tablaMultiplicar[i - 1][j - 1] = i * j;
            }
        }

        // Mostrar la matriz
        System.out.println("Tabla de multiplicar hasta " + numero + ":");
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablaMultiplicar[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
