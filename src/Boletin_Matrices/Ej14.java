package Boletin_Matrices;

public class Ej14 {

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        int[][] matrizTranspuesta = transponerMatriz(matriz);

        System.out.println("Matriz transpuesta:");
        imprimirMatriz(matrizTranspuesta);
    }

    // Método para transponer una matriz
    private static int[][] transponerMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] matrizTranspuesta = new int[columnas][filas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }

        return matrizTranspuesta;
    }

    // Método para imprimir una matriz
    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
