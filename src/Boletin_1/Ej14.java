package Boletin_1;

public class Ej14 {
    private static final int CAPACIDAD_MAXIMA = 5;
    private static int[] cola;
    private static int inicio; // Índice del frente de la cola
    private static int limiteCola; // Índice del final de la cola
    private static int tamaño; // Tamaño actual de la cola

    public static void iniciarCola() {
        cola = new int[CAPACIDAD_MAXIMA];
        inicio = 0;
        limiteCola = -1;
        tamaño = 0;
    }

    public static void encolar(int elemento) {
        if (tamaño < CAPACIDAD_MAXIMA) {
            limiteCola = (limiteCola + 1) % CAPACIDAD_MAXIMA;
            cola[limiteCola] = elemento;
            tamaño++;
            mostrarCola();
        } else {
            System.out.println("La cola está llena. No se puede encolar el elemento " + elemento);
        }
    }

    public static void desencolar() {
        if (tamaño > 0) {
            int elementoDesencolado = cola[inicio];
            inicio = (inicio + 1) % CAPACIDAD_MAXIMA;
            tamaño--;
            System.out.println("Elemento desencolado: " + elementoDesencolado);
            mostrarCola();
        } else {
            System.out.println("La cola está vacía. No se puede desencolar.");
        }
    }

    private static void mostrarCola() {
        System.out.print("Cola: ");
        int indice = inicio;
        for (int i = 0; i < tamaño; i++) {
            System.out.print(cola[indice] + " ");
            indice = (indice + 1) % CAPACIDAD_MAXIMA;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Inicializar la cola
        iniciarCola();

        // Encolar elementos
        encolar(5);
        encolar(10);
        encolar(7);

        // Desencolar elementos
        desencolar();
        desencolar();
        desencolar();
    }
}
