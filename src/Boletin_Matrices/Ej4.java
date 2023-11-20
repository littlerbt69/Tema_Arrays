package Boletin_Matrices;

public class Ej4 {
    public static void main(String[] args) {
        int [][] Matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };

        imprimeMatrizInverso(Matriz);
    }

    public static void imprimeMatrizInverso (int[][] matriz) {
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
