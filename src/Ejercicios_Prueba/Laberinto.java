package Ejercicios_Prueba;

import java.util.Arrays;
import java.util.Scanner;

public class Laberinto {
    private static final int PASILLO = 0;
    private static final int PARED = 1;
    private static final int SALIDA = 2;

    private int[][] matrizLaberinto;
    private int posicionJugadorFila;
    private int posicionJugadorColumna;

    public Laberinto(int filas, int columnas) {
        matrizLaberinto = new int[filas][columnas];
        // Inicializar el laberinto con pasillos (0)
        for (int i = 0; i < filas; i++) {
            Arrays.fill(matrizLaberinto[i], PASILLO);
        }

        // Establecer la posición inicial del jugador
        posicionJugadorFila = 0;
        posicionJugadorColumna = 0;
        //comentario prueba
    }

    public void imprimirLaberinto() {
        for (int i = 0; i < matrizLaberinto.length; i++) {
            for (int j = 0; j < matrizLaberinto[i].length; j++) {
                if (i == posicionJugadorFila && j == posicionJugadorColumna) {
                    System.out.print("P ");
                } else {
                    System.out.print(matrizLaberinto[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void agregarPared(int fila, int columna) {
        matrizLaberinto[fila][columna] = PARED;
    }

    public void agregarSalida(int fila, int columna) {
        matrizLaberinto[fila][columna] = SALIDA;
    }

    public boolean moverJugador(String direccion) {
        switch (direccion.toLowerCase()) {
            case "arriba":
                if (posicionJugadorFila > 0 && matrizLaberinto[posicionJugadorFila - 1][posicionJugadorColumna] != PARED) {
                    posicionJugadorFila--;
                    return true;
                }
                break;
            case "abajo":
                if (posicionJugadorFila < matrizLaberinto.length - 1 && matrizLaberinto[posicionJugadorFila + 1][posicionJugadorColumna] != PARED) {
                    posicionJugadorFila++;
                    return true;
                }
                break;
            case "izquierda":
                if (posicionJugadorColumna > 0 && matrizLaberinto[posicionJugadorFila][posicionJugadorColumna - 1] != PARED) {
                    posicionJugadorColumna--;
                    return true;
                }
                break;
            case "derecha":
                if (posicionJugadorColumna < matrizLaberinto[0].length - 1 && matrizLaberinto[posicionJugadorFila][posicionJugadorColumna + 1] != PARED) {
                    posicionJugadorColumna++;
                    return true;
                }
                break;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Laberinto laberinto = new Laberinto(5, 5);
        laberinto.agregarPared(1, 1);
        laberinto.agregarPared(2, 1);
        laberinto.agregarPared(3, 1);
        laberinto.agregarPared(3, 2);
        laberinto.agregarPared(3, 3);
        laberinto.agregarPared(1, 3);
        laberinto.agregarPared(2, 3);
        laberinto.agregarSalida(4, 4);

        while (true) {
            laberinto.imprimirLaberinto();
            System.out.print("Ingrese la dirección (arriba, abajo, izquierda, derecha): ");
            String direccion = scanner.nextLine();

            if (laberinto.moverJugador(direccion)) {
                if (laberinto.matrizLaberinto[laberinto.posicionJugadorFila][laberinto.posicionJugadorColumna] == Laberinto.SALIDA) {
                    System.out.println("¡Has llegado a la salida! ¡Ganaste!");
                    break;
                }
            } else {
                System.out.println("Movimiento no válido. Inténtalo de nuevo.");
            }
        }

        scanner.close();
    }
}
