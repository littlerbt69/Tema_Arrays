package Boletin_Matrices;

public class Ej5 {
    public static void main(String[] args) {
        int [][] Matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        imprimePorColumnas(Matriz);
    }

    public static void imprimePorColumnas (int [][] matriz) {
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
