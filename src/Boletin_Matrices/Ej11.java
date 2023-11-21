package Boletin_Matrices;

public class Ej11 {
    public static void main(String[] args) {
        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matriz2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        if (matricesInversas(matriz1, matriz2)) {
            System.out.println("Las matrices son inversas entre ellas");
        } else {
            System.out.println("Las matrices no son inversas entre ellas");
        }
    }

    public static boolean matricesInversas (int[][] matriz1, int[][] matriz2) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                if (matriz1[i][j] != matriz2[matriz1.length - 1 - i][matriz1[0].length - 1 - j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
