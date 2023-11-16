package Boletin_1;

import java.util.Scanner;

public class Ej13 {
    static final int CAPACIDAD_MAXIMA = 10;
    static int[] pila = new int[CAPACIDAD_MAXIMA];
    static int limitePila = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Apilar");
            System.out.println("2. Desapilar");
            System.out.println("3. Mostrar Pila");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a apilar: ");
                    int elementoApilar = scanner.nextInt();
                    apilar(elementoApilar);
                    break;
                case 2:
                    desapilar();
                    break;
                case 3:
                    mostrarPila();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    public static void apilar(int elemento) {
        if (limitePila < CAPACIDAD_MAXIMA) {
            pila[limitePila++] = elemento;
            System.out.println("Elemento apilado: " + elemento);
            mostrarPila();
        } else {
            System.out.println("La pila está llena. No se puede apilar el elemento " + elemento);
        }
    }

    public static void desapilar() {
        if (limitePila >= 0) {
            int elementoDesapilado = pila[limitePila--];
            System.out.println("Elemento desapilado: " + elementoDesapilado);
            mostrarPila();
        } else {
            System.out.println("La pila está vacía. No se puede desapilar.");
        }
    }

    public static void mostrarPila() {
        System.out.println("Valores actuales de la pila:");
        if (limitePila > 0) {
            for (int i = 0; i < limitePila; i++) {
                System.out.print(pila[i] + " ");
            }
        } else {
            System.out.print("La pila está vacía");
        }
        System.out.println();
    }
}
