package Boletin_1;

import java.util.Arrays;

public class Ej9 {
    public static void main(String[] args) {
        int[] array = {4, 8, 15, 16, 23, 42};

        int valorABuscar = 16;

        boolean ordenInverso = true;

        int posicion = encontrarPosicion(array, valorABuscar, ordenInverso);

        if (posicion != -1) {
            System.out.println("El valor " + valorABuscar + " se encuentra en la posición " + posicion);
        } else {
            System.out.println("El valor " + valorABuscar + " no se encuentra en el array.");
        }
    }

    public static int encontrarPosicion(int[] array, int valor, boolean reverse) {
        //ordena el array de mayor a menor
        if (reverse) {
            Arrays.sort(array);
            for (int i = 0; i < array.length; i++) {
                if (array[i] == valor) {
                    return i + 1;
                } else {
                    // Ordenar el array de menor a mayor (predeterminado)
                    Arrays.sort(array);
                    for (i = 0; i < array.length; i++) {
                        if (array[i] == valor) {
                            return i; // Se encontró el valor, devuelve la posición
                        }
                    }
                }
                }
            }
            return -1; // El valor no se encontró en el array, devuelve -1
        }
    }