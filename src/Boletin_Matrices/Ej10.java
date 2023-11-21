package Boletin_Matrices;

public class Ej10 {

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 7, 2, 1},
                {4, 5, 3, 5, 4},
                {7, 8, 9, 8, 7},
                {1, 2, 10, 2, 1}
        };

        if (esMatrizSimetricaY(matriz)) {
            System.out.println("La matriz es simétrica en base a su eje Y");
        } else {
            System.out.println("La matriz no es simétrica en base a su eje Y");
        }
    }

    // Método para verificar si una matriz es simétrica respecto al eje Y
    public static boolean esMatrizSimetricaY(int[][] matriz) {

        // Verificar simetría respecto al eje Y
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length / 2; j++) {
                // Comprobar si los elementos son simétricos
                if (matriz[i][j] != matriz[i][matriz[0].length - 1 - j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
