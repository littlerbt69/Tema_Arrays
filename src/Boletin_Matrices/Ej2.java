package Boletin_Matrices;

public class Ej2 {
    public static void main(String[] args) {
        int[][] Matriz = {
                {1, 2, 3},
                {1, 2, 3},
                {20, 30, 40},
        };

        int suma = sumaValores(Matriz);

        System.out.println("La suma de la matriz es: " + suma);
    }

    public static int sumaValores (int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}
