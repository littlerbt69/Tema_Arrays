package Boletin_Matrices;

public class Ej9 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 3, 5, 6},
                {4, 2, 0, 8},
                {4, 2, 0, 8},
                {1, 3, 5, 6}

        };

        if (comprobarSimetriaX(matriz)) {
            System.out.println("La matriz es simetrica en base a su eje X");
        } else {
            System.out.println("La matriz no es simetrica en base a su eje X");
        }
    }

    public static boolean comprobarSimetriaX (int[][] matriz) {
        if (matriz.length != matriz[0].length) {
            return false;
        }

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
