package Ejercicios_Prueba;

public class Prueba_Matriz {
    public static void main(String[] args) {
        int a = 3;

        System.out.println(a);

        prueba(a);

        System.out.println(a);
    }

    public static void modificaMatriz (int[][] m) {
        m[2][3] = 19;
    }

    public static void prueba (int a) {
        a = 55;
    }
}
