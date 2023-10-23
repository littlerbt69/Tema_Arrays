package Ejercicios_Prueba;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final int TOTAL_ALUMNOS = 10;

        double[] vectorNotas=new double[TOTAL_ALUMNOS];
        insertarNotasEnVector(vectorNotas);
        mostrarVectorNotas(vectorNotas);
    }

    private static void insertarNotasEnVector(double[] vectorNotas) {
        for (int i = 0; i < vectorNotas.length; i++) {
            System.out.println("Introduce la nota del alumno "+ (i+1));
            Scanner teclado = new Scanner(System.in);
            vectorNotas[i]=Double.parseDouble(teclado.nextLine());
        }
    }
    private static void mostrarVectorNotas(double[] vectorNotas) {
        for (int i = 0; i < vectorNotas.length; i++) {
            System.out.println("Nota del alumno " + (i+1) + ":" + vectorNotas[i]);
        }
    }
}
