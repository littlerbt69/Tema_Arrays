package Ejercicios_Prueba;

public class Invertir {
    public static void main(String[] args) {
        int[] Array1 = new int[5];
        int[] Array2 = {1,2,3,4,5};

        for (int i = Array2.length - 1, j = 0; i >= 0; i--, j++) {
            Array1[i] = Array2[j];
        }

        for (int elem: Array1) {
            System.out.println(elem);
        }
    }
}
