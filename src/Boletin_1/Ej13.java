package Boletin_1;

public class Ej13 {
    private static final int CAPACIDAD_MAXIMA = 10;
    private static int[] pila;
    private static int tope; // Índice del tope de la pila

    public static void iniciarPila() {
        pila = new int[CAPACIDAD_MAXIMA];
        tope = -1; // Inicializar la pila como vacía
    }

    public static void apilar(int elemento) {
        if (tope < CAPACIDAD_MAXIMA - 1) {
            pila[++tope] = elemento;
            mostrarPila();
        } else {
            System.out.println("La pila está llena. No se puede apilar el elemento " + elemento);
        }
    }

    public static void desapilar() {
        if (tope >= 0) {
            int elementoDesapilado = pila[tope--];
            System.out.println("Elemento desapilado: " + elementoDesapilado);
            mostrarPila();
        } else {
            System.out.println("La pila está vacía. No se puede desapilar.");
        }
    }

    private static void mostrarPila() {
        System.out.print("Pila: ");
        for (int i = 0; i <= tope; i++) {
            System.out.print(pila[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Inicializar la pila
        iniciarPila();

        // Apilar elementos
        apilar(5);
        apilar(10);
        apilar(7);

        // Desapilar elementos
        desapilar();
        desapilar();
        desapilar();
    }
}
