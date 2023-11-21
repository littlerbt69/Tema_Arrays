package Boletin_Matrices;

public class Ej13_B {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        if (matriz.length == matriz[0].length) {
            int[][] matriz2 = invertirMatriz(matriz);
            imprimirMatriz(matriz2);
        } else {
            System.out.println("La matriz dada no es cuadrada, no se procederá con la inversión.");
        }

    }

    public static int[][] invertirMatriz(int[][] matriz) {
        int[][] matrizInv = new int[matriz.length][matriz[0].length];

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int colum = 0; colum < matriz[0].length; colum++) {

                matrizInv[matriz.length - 1 - colum][matrizInv[0].length - 1 - fila] = matriz[fila][colum];
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