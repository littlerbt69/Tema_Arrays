package Boletin_Matrices;

public class Ej1 {
    public static void main(String[] args) {
        int[][] matrizNegativo = {
                {1, 2, 3},
                {-4, 5, 6}
        };

        if (cifraNegativa(matrizNegativo)) {
            System.out.println("En la matriz existe minimo un valor negativo");
        } else {
            System.out.println("En la matriz no existe ningun valor negativo");
        }

    }

    public static boolean cifraNegativa(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
