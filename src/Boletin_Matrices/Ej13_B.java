package Boletin_Matrices;

public class    Ej13_B {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {3, 2, 1, 4, 5},
                {9, 5, 8, 6, 7},
                {0, 9, 8, 5, 4}
        };

        if (matriz.length == matriz[0].length) {
            int[][] matriz2 = invertirMatriz(matriz);
            imprimirMatriz(matriz2);
        } else {
            System.out.println("La matriz dada no es cuadrada, no se puede invertir");
        }

    }

    public static int[][] invertirMatriz(int[][] matriz) {
        int[][] matrizInv = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizInv[i][j] = matriz[matriz.length - 1 - j][matriz.length - 1 - i];
            }
        }

        return matrizInv;
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