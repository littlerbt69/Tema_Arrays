package Ejercicios_Prueba;

public class Recorrido {
    public static void main(String[] args) {
        int[] Array = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }

        System.out.println();

        for (int i = Array.length - 1; i >= 0; i--) {
            System.out.println(Array[i]);
        }
    }
}
