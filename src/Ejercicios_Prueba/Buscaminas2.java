package Ejercicios_Prueba;

import java.util.Random;
import java.util.Scanner;

public class Buscaminas2 {

    private static final int FACIL = 8;
    private static final int MEDIO = 12;
    private static final int DIFICIL = 16;

    private static int filas;
    private static int columnas;
    private static int[][] tablero;
    private static boolean[][] tableroVisible;
    private static boolean juegoTerminado;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona la dificultad:");
        System.out.println("1. Fácil");
        System.out.println("2. Medio");
        System.out.println("3. Difícil");

        int opcion = scanner.nextInt();

        inicializarJuego(opcion);
        jugar();

        scanner.close();
    }

    private static void inicializarJuego(int dificultad) {
        switch (dificultad) {
            case 1:
                filas = FACIL;
                columnas = FACIL;
                break;
            case 2:
                filas = MEDIO;
                columnas = MEDIO;
                break;
            case 3:
                filas = DIFICIL;
                columnas = DIFICIL;
                break;
            default:
                System.out.println("Opción no válida. Seleccionando dificultad fácil por defecto.");
                filas = FACIL;
                columnas = FACIL;
                break;
        }

        tablero = new int[filas][columnas];
        tableroVisible = new boolean[filas][columnas];
        juegoTerminado = false;

        inicializarTablero();
        colocarMinas();
    }

    private static void jugar() {
        Scanner scanner = new Scanner(System.in);

        while (!juegoTerminado) {
            imprimirTablero();
            System.out.print("Fila: ");
            int fila = scanner.nextInt() - 1; // Ajuste para que la primera fila sea 1
            System.out.print("Columna: ");
            int columna = scanner.nextInt();

            if (esCasillaValida(fila, columna)) {
                if (tablero[fila][columna] == -1) {
                    System.out.println("¡Boom! Has tocado una mina. Fin del juego.");
                    juegoTerminado = true;
                } else {
                    revelarCasilla(fila, columna);
                    if (esVictoria()) {
                        System.out.println("¡Felicidades! Has ganado.");
                        juegoTerminado = true;
                    }
                }
            } else {
                System.out.println("Por favor, elige una casilla válida.");
            }
        }

        scanner.close();
    }

    private static void inicializarTablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = 0;
                tableroVisible[i][j] = false;
            }
        }
    }

    private static void colocarMinas() {
        Random random = new Random();
        int minas = 0;

        switch (filas) {
            case FACIL:
                minas = 10;
                break;
            case MEDIO:
                minas = 20;
                break;
            case DIFICIL:
                minas = 30;
                break;
        }

        while (minas > 0) {
            int fila = random.nextInt(filas);
            int columna = random.nextInt(columnas);

            if (tablero[fila][columna] != -1) {
                tablero[fila][columna] = -1;
                minas--;
            }
        }

        contarMinasAlrededor();
    }

    private static void contarMinasAlrededor() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (tablero[i][j] != -1) {
                    int minasAlrededor = contarMinasAlrededor(i, j);
                    tablero[i][j] = minasAlrededor;
                }
            }
        }
    }

    private static int contarMinasAlrededor(int fila, int columna) {
        int contador = 0;

        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {
                if (esCasillaValida(i, j) && tablero[i][j] == -1) {
                    contador++;
                }
            }
        }

        return contador;
    }

    private static boolean esCasillaValida(int fila, int columna) {
        return fila >= 0 && fila < filas && columna >= 0 && columna < columnas && !tableroVisible[fila][columna];
    }

    private static void revelarCasilla(int fila, int columna) {
        if (!tableroVisible[fila][columna]) {
            tableroVisible[fila][columna] = true;

            if (tablero[fila][columna] == 0) {
                for (int i = fila - 1; i <= fila + 1; i++) {
                    for (int j = columna - 1; j <= columna + 1; j++) {
                        if (esCasillaValida(i, j)) {
                            revelarCasilla(i, j);
                        }
                    }
                }
            }
        }
    }

    private static boolean esVictoria() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (tablero[i][j] != -1 && !tableroVisible[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void imprimirTablero() {
        System.out.println("\nTablero:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (tableroVisible[i][j]) {
                    if (tablero[i][j] == -1) {
                        System.out.print("* ");
                    } else {
                        System.out.print(tablero[i][j] + " ");
                    }
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
