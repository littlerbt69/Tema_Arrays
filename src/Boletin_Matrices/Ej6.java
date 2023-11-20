package Boletin_Matrices;

public class Ej6 {
    public static void main(String[] args) {
        int[][] Matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        imprimirPorColumnasInvertidas(Matriz);
    }

    public static void imprimirPorColumnasInvertidas(int[][] matriz) {
        for (int j = matriz[0].length - 1; j >= 0; j--) {
            for (int i = matriz.length - 1; i >= 0; i--) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
