package Boletin_1;

public class Ej18 {
    public static void main(String[] args) {
        char[][] matrizOriginal = {
                {'a', 'b', 'c', 'd'},
                {'e', 'f', 'g', 'h'},
                {'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p'}
        };

        char[][] matrizEspejoDiagonal = matrizEspejo(matrizOriginal);

        System.out.println("Matriz Original:");
        imprimirMatriz(matrizOriginal);

        if (matrizCuadrada(matrizOriginal)) {
            System.out.println("\nLa matriz espejo es la siguiente: ");
            imprimirMatriz(matrizEspejoDiagonal);
        } else {
            System.out.println("La matriz no es cuadrada, no se puede reflejar");
        }
    }

    // Método para copiar la matriz en forma de espejo diagonal
    private static char[][] matrizEspejo(char[][] matrizOriginal) {

        if (!matrizCuadrada(matrizOriginal)) {
            return null;
        }

        char[][] matrizEspejoDiagonal = new char[matrizOriginal.length][matrizOriginal[0].length];

        // Copiar la matriz original en la nueva matriz en forma de espejo diagonal
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[0].length; j++) {
                matrizEspejoDiagonal[i][j] = matrizOriginal[matrizOriginal.length - 1 - i][matrizOriginal[0].length - 1 - j];
            }
        }

        return matrizEspejoDiagonal;
    }

    // Método para imprimir una matriz (esta vez en char)
    public static void imprimirMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Cambiar de línea al final de cada fila
        }
    }

    public static boolean matrizCuadrada (char[][] matriz) {
        if (matriz == null || matriz.length == 0) {
            return false;
        }

        return matriz.length == matriz[0].length;
    }
}
