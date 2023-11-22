package Boletin_Matrices;

public class Ej8 {
    public static void main(String[] args) {
        int[][] matrizA = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrizB = {
                {3, 4, 5},
                {6, 7, 8}
        };

        if (!verificarTamaño(matrizA, matrizB)) {
            System.out.println("Las matrices no tienen el mismo tamaño, no es posible sumarlas");
            return;
        }

        int[][] resultado = sumaMatriz(matrizA, matrizB);

        System.out.println("Primera matriz: ");
        imprimeMatriz(matrizA);

        System.out.println("\nSegunda matriz: ");
        imprimeMatriz(matrizB);

        System.out.println("\nResultado de la suma: ");
        imprimeMatriz(resultado);


    }

    public static int[][] sumaMatriz (int[][] matrizA, int[][] matrizB) {
        int[][] resultado = new int[matrizA.length][matrizB[0].length];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++){
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        return resultado;
    }

    public static void imprimeMatriz (int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }

    public static boolean verificarTamaño(int[][] matrizA, int[][] matrizB) {
        if (matrizA.length != matrizB.length) {
            return false; // Diferente número de filas
        }

        if (matrizA[0].length != matrizB[0].length) {
            return false; // Diferente número de columnas
        }

        return true;
    }
}
