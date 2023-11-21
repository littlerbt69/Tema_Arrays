package Boletin_Matrices;

public class Ej12 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {3, 2, 1, 4, 5},
                {9, 5, 8, 6, 7},
                {0, 9, 8, 5, 4},
        };

        System.out.println("Matriz original: ");
        imprimeMatriz(matriz);

        int[][] matrizReflejada = matrizReflejada(matriz);

        if (matrizCuadrada(matriz)) {
            System.out.println("La matriz reflejada es la siguiente: ");
            imprimeMatriz(matrizReflejada);
        } else {
            System.out.println("La matriz no es cuadrada, no se puede reflejar");
        }
    }

    public static int[][] matrizReflejada (int[][] matriz) {

        if (!matrizCuadrada(matriz)) {
            return null;
        }

        int n = matriz.length;
        int[][] matrizReflejada = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizReflejada[i][j] = matriz[j][i];
            }
        }
        return matrizReflejada;
    }

    public static boolean matrizCuadrada (int[][] matriz) {
        if (matriz == null || matriz.length == 0) {
            return false;
        }

        return matriz.length == matriz[0].length;
    }

    public static void imprimeMatriz (int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
