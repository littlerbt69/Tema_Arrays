package Boletin_1;

public class Ej17 {

    public static void main(String[] args) {
        int[][] matrizOriginal = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Verificar el tamaño de la matriz original
        int filasOriginales = matrizOriginal.length;
        int columnasOriginales = matrizOriginal.length;

        System.out.println("Tamaño de la matriz original: " + filasOriginales + "x" + columnasOriginales);

        int[][] matrizCopia = new int[filasOriginales][columnasOriginales];

        int filasCopia = matrizCopia.length;
        int columnasCopia = matrizCopia[0].length;

        System.out.println("Tamaño de la matriz copia: " + filasCopia + "x" + columnasCopia);

        // Verificar si los tamaños son iguales
        if (filasOriginales == filasCopia && columnasOriginales == columnasCopia) {
            // Copiar elementos de la matriz original a la matriz copia
            for (int i = 0; i < filasOriginales; i++) {
                for (int j = 0; j < columnasOriginales; j++) {
                    matrizCopia[i][j] = matrizOriginal[i][j];
                }
            }

            // Imprimir la matriz copia
            System.out.println("Matriz copia:");
            for (int i = 0; i < filasCopia; i++) {
                for (int j = 0; j < columnasCopia; j++) {
                    System.out.print(matrizCopia[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No se puede copiar. ¡Las matrices no tienen el mismo tamaño!");
        }
    }
}
