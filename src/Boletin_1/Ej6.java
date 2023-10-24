package Boletin_1;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario el tamaño del array
        System.out.print("Introduce el tamaño del array: ");
        int tamaño = sc.nextInt();

        // Crear un array con el tamaño especificado
        int[] array = new int[tamaño];

        // Pedir al usuario que ingrese los elementos del array
        System.out.println("Introduce los elementos del array:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        // Pedir al usuario el elemento a buscar
        System.out.print("Introduce el elemento a buscar: ");
        int elementoABuscar = sc.nextInt();

        // Verificar si el elemento a buscar se encuentra en el array
        boolean encontrado = false;
        for (int i = 0; i < tamaño; i++) {
            if (array[i] == elementoABuscar) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El elemento " + elementoABuscar + " se encuentra en el array.");
        } else {
            System.out.println("El elemento " + elementoABuscar + " no se encuentra en el array.");
        }
    }
}
