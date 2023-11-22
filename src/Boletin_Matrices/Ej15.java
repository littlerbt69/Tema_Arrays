package Boletin_Matrices;

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int filas = 6;
        int columnas = 6;

        System.out.println("Introduce la fila del valor que quieras saber: ");
        int filaNumero = teclado.nextInt();
        System.out.println("Introduce la columna del valor que quieras saber: ");
        int columnaNumero = teclado.nextInt();

        int numeroCasilla = obtenerNumero(filaNumero, columnaNumero, filas, columnas);

        // Verificar si las coordenadas están dentro de los límites de la matriz
        if (numeroCasilla != -1) {
            System.out.println("La casilla [" + filaNumero + "," + columnaNumero + "] ocupa el número " + numeroCasilla);
        } else {
            System.out.println("La casilla [" + filaNumero + "," + columnaNumero + "], es desconocida");
        }
    }

    public static int obtenerNumero(int fila, int columna, int numFilas, int numColumnas) {
        // Calcular el número de casilla recorriendo primero por filas y luego por columnas

        // Verificar si las coordenadas están dentro de los límites de la matriz
        if (fila >= 0 && fila < numFilas && columna >= 0 && columna < numColumnas) {
            // Calcular el número de casilla recorriendo primero por filas y luego por columnas
            return fila * numColumnas + columna + 1;
        } else {
            return -1;
        }
    }
}
