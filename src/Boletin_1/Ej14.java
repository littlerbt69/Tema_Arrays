package Boletin_1;

public class Ej14 {
    private static final int CAPACIDAD_MAXIMA = 10;
    private int[] cola;
    private int frente; // Índice del frente de la cola
    private int fin; // Índice del final de la cola
    private int tamaño; // Tamaño actual de la cola

    public void iniciarCola() {
        cola = new int[CAPACIDAD_MAXIMA];
        frente = 0;
        fin = -1;
        tamaño = 0;
    }

    public void encolar(int elemento) {
        if (tamaño < CAPACIDAD_MAXIMA) {
            fin = (fin + 1) % CAPACIDAD_MAXIMA;
            cola[fin] = elemento;
            tamaño++;
            mostrarCola();
        } else {
            System.out.println("La cola está llena. No se puede encolar el elemento " + elemento);
        }
    }

    public void desencolar() {
        if (tamaño > 0) {
            int elementoDesencolado = cola[frente];
            frente = (frente + 1) % CAPACIDAD_MAXIMA;
            tamaño--;
            System.out.println("Elemento desencolado: " + elementoDesencolado);
            mostrarCola();
        } else {
            System.out.println("La cola está vacía. No se puede desencolar.");
        }
    }

    private void mostrarCola() {
        System.out.print("Cola: ");
        int indice = frente;
        for (int i = 0; i < tamaño; i++) {
            System.out.print(cola[indice] + " ");
            indice = (indice + 1) % CAPACIDAD_MAXIMA;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Ej14 colaEnteros = new Ej14();

        // Inicializar la cola
        colaEnteros.iniciarCola();

        // Encolar elementos
        colaEnteros.encolar(5);
        colaEnteros.encolar(10);
        colaEnteros.encolar(7);

        // Desencolar elementos
        colaEnteros.desencolar();
        colaEnteros.desencolar();
        colaEnteros.desencolar();
    }
}
