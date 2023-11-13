package Boletin_1;

public class Ej8 {
    public static void main(String[] args) {
        int[] array = {4, 8, 15, 16, 23, 42};
        int valorABuscar = 23;

        int posicion = encontrarPosicion(array, valorABuscar);

        if (posicion != -1) {
            System.out.println("El valor " + valorABuscar + " se encuentra en la posición " + posicion);
        } else {
            System.out.println("-1");
        }
    }

    public static int encontrarPosicion(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i + 1; // Se ha encontrado el valor, devolver la posición
            }
        }
        return -1; // El valor no se encuentra en el array
    }
}
