package Boletin_Matrices;

public class Ej9 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 3, 5, 6},
                {4, 2, 0, 8},
                {4, 2, 0, 8},
                {1, 3, 5, 6}

        };

        if (esMatrizCuadrada(matriz) && comprobarSimetriaX(matriz)) {
            System.out.println("La matriz es simétrica en base a su eje X");
        } else {
            System.out.println("La matriz no es simétrica en base a su eje X o no es cuadrada");
        }
    }

    public static boolean esMatrizCuadrada(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz.length != matriz[i].length) {
                return false;
            }
        }
        return true;
    }

    public static boolean comprobarSimetriaX (int[][] matriz) {

        if (!esMatrizCuadrada(matriz)) {
            return false;
        }

        //Recorre la matriz hasta la mitad
        for (int i = 0; i < matriz.length / 2; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] != matriz[matriz.length -1 -i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
