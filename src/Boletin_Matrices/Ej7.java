package Boletin_Matrices;

public class Ej7 {
    public static void main(String[] args) {
        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matriz2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        if (sonMatricesIguales(matriz1, matriz2)) {
            System.out.println("Las matrices son iguales");
        } else {
            System.out.println("Las matrices no son iguales");
        }

        if (esMatrizCuadrada(matriz1)) {
            System.out.println("\nLa matriz1 es cuadrada");
        } else {
            System.out.println("La matriz1 no es cuadrada");
        }

        if (esMatrizCuadrada(matriz2)) {
            System.out.println("La matriz2 es cuadrada");
        } else {
            System.out.println("La matriz2 no es cuadrada");
        }
    }

    public static boolean sonMatricesIguales(int[][] matriz1, int[][] matriz2) {
        if (matriz1.length != matriz2.length && matriz1[0].length != matriz2[0].length) {
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

    public static boolean esMatrizCuadrada(int[][] matriz) {
        // Comprueba si la matriz es cuadrada
        return matriz.length == matriz[0].length;
    }
}
