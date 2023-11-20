package Boletin_1;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca el valor de N
        System.out.print("¿Hasta qué número quieres calcular las tablas de multiplicar?: ");
        int n = scanner.nextInt();

        // Crear la matriz de Nx10
        int[][] tablaMultiplicar = new int[n][10];

        // Llenar la matriz con los resultados de las tablas de multiplicar
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                tablaMultiplicar[i - 1][j - 1] = i * j;
            }
        }

        // Mostrar la matriz
        System.out.println("Tabla de multiplicar hasta " + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablaMultiplicar[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
