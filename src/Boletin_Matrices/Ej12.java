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

        if (esMatrizCuadrada(matriz)) {
            System.out.println("La matriz reflejada es la siguiente: ");
            imprimeMatriz(matrizReflejada);
        } else {
            System.out.println("La matriz no es cuadrada, no se puede reflejar");
        }
    }

    public static int[][] matrizReflejada (int[][] matriz) {

        if (!esMatrizCuadrada(matriz)) {
            return null;
        }

        int[][] matrizReflejada = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizReflejada[i][j] = matriz[j][i];
            }
        }
        return matrizReflejada;
    }

    public static boolean esMatrizCuadrada(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz.length != matriz[i].length) {
                return false;
            }
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
