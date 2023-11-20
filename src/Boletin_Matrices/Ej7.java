package Boletin_Matrices;

public class Ej7 {
    public static void main(String[] args) {
        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matriz2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        if (sonMatricesIguales(matriz1, matriz2)) {
            System.out.println("Las matrices son iguales");
        } else {
            System.out.println("Las matrices no son iguales");
        }
    }

    public static boolean sonMatricesIguales(int[][] matriz1, int[][] matriz2) {
        //Comprueba si las matrices son iguales de dimensiones
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            return false;
        }

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false; // Si encuentra un elemento diferente, las matrices son diferentes
                }
            }
        }
        return true;
    }
}
