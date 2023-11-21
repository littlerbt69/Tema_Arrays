package Boletin_Matrices;

public class Ej13 {

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {3, 2, 1, 4, 5},
                {9, 5, 8, 6, 7},
                {0, 9, 8, 5, 4}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        if (esMatrizCuadrada(matriz)) {
            reflejarEnDiagonal(matriz);

            System.out.println("Matriz reflejada en diagonal:");
            imprimirMatriz(matriz);
        } else {
            System.out.println("La matriz no es cuadrada.");
        }
    }

    // Método para comprobar si la matriz es cuadrada
    private static boolean esMatrizCuadrada(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        return filas == columnas;
    }

    // Método para reflejar la matriz en diagonal
    private static void reflejarEnDiagonal(int[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Intercambiar elementos simétricos en la diagonal
                int temp = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = temp;
            }
        }
    }

    // Método para imprimir la matriz
    private static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
