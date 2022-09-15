package ObligatorioTeoria.CaminoMasCorto.CaminoMasCortoMatriz;

import java.util.ArrayList;
import java.util.HashMap;

import ObligatorioTeoria.CaminoMasCorto.CaminoMasCortoGrafoYRecursion.Nodo;
import ObligatorioTeoria.CaminoMasCorto.CaminoMasCortoGrafoYRecursion.Vertice;

public class Problema1Matriz {
    final static int INF = 9999, nV = 12;

    // Implementing floyd warshall algorithm
    public static void floydWarshall(int graph[][]) {
        int matrix[][] = new int[nV][nV];
        int i, j, k;

        for (i = 0; i < nV; i++)
            for (j = 0; j < nV; j++)
                matrix[i][j] = graph[i][j];

        // Adding vertices individually
        for (k = 0; k < nV; k++) {
            for (i = 0; i < nV; i++) {
                for (j = 0; j < nV; j++) {
                    if (matrix[i][k] + matrix[k][j] < matrix[i][j])
                        matrix[i][j] = matrix[i][k] + matrix[k][j];
                }
            }
        }
        printMatrix(matrix);
    }

    static void printMatrix(int matrix[][]) {
        for (int i = 0; i < nV; ++i) {
            for (int j = 0; j < nV; ++j) {
                if (matrix[i][j] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int graph[][] = { { 0, 300, 600, 700, INF, INF, INF, INF, INF, INF, INF, INF },
                { INF, 0, INF, INF, 2300, 2200, 1950, INF, INF, INF, INF, INF },
                { INF, INF, 0, INF, 2200, 2100, 2500, INF, INF, INF, INF, INF },
                { INF, INF, INF, 0, 2100, 1900, 1800, INF, INF, INF, INF, INF },
                { INF, INF, INF, INF, 0, INF, INF, 3100, 5200, 3950, INF, INF },
                { INF, INF, INF, INF, INF, 0, INF, 3200, 2100, 2500, INF, INF },
                { INF, INF, INF, INF, INF, INF, 0, 2100, 1900, 1800, INF, INF },
                { INF, INF, INF, INF, INF, INF, INF, 0, INF, INF, 3500, 5000 },
                { INF, INF, INF, INF, INF, INF, INF, INF, 0, INF, 7500, 9300 },
                { INF, INF, INF, INF, INF, INF, INF, INF, INF, 0, 8800, 9600 },
                { INF, INF, INF, INF, INF, INF, INF, INF, INF, INF, 0, 3400 },
                { INF, INF, INF, INF, INF, INF, INF, INF, INF, INF, INF, 0 } };

       floydWarshall(graph);
    }
}
