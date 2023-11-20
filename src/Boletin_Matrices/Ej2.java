package Boletin_Matrices;

public class Ej2 {
    public static void main(String[] args) {
        int[][] Matriz = {
                {1, 2, 1},
                {1, 2, 1},
                {2, 22, 1},
        };

        System.out.println("La suma de la matriz es: " + sumaValores(Matriz));
    }

    public static int sumaValores (int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}
