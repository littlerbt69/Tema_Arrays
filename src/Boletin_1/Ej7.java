package Boletin_1;

public class Ej7 {
    public static void main(String[] args) {
        int[] arrayElementos = {1, 2, 5, 6, 7};

        int elemento = 6;

        if (contieneElemento(arrayElementos, elemento)) {
            System.out.println("El elemento " + elemento + " se encuentra en el array: ");
        } else {
            System.out.println("El elemento " + elemento + " no se encuentra en el array: ");
        }
    }

    public static boolean contieneElemento(int[] array, int elementoBuscado) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementoBuscado) {
                return true;
            }
        }
        return false;
    }
}
