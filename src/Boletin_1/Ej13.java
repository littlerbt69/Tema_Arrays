package Boletin_1;

public class Ej13 {
    private static final int CAPACIDAD_MAXIMA = 10;
    private int[] pila;
    private int tope; // Índice del tope de la pila

    public void iniciarPila() {
        pila = new int[CAPACIDAD_MAXIMA];
        tope = -1; // Inicializar la pila como vacía
    }

    public void apilar(int elemento) {
        if (tope < CAPACIDAD_MAXIMA - 1) {
            pila[++tope] = elemento;
            mostrarPila();
        } else {
            System.out.println("La pila está llena. No se puede apilar el elemento " + elemento);
        }
    }

    public void desapilar() {
        if (tope >= 0) {
            int elementoDesapilado = pila[tope--];
            System.out.println("Elemento desapilado: " + elementoDesapilado);
            mostrarPila();
        } else {
            System.out.println("La pila está vacía. No se puede desapilar.");
        }
    }

    private void mostrarPila() {
        System.out.print("Pila: ");
        for (int i = 0; i <= tope; i++) {
            System.out.print(pila[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Ej13 pilaEnteros = new Ej13();

        // Inicializar la pila
        pilaEnteros.iniciarPila();

        // Apilar elementos
        pilaEnteros.apilar(5);
        pilaEnteros.apilar(10);
        pilaEnteros.apilar(7);

        // Desapilar elementos
        pilaEnteros.desapilar();
        pilaEnteros.desapilar();
        pilaEnteros.desapilar();
    }
}
