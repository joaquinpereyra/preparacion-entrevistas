package ObligatorioTeoria.CaminoMasCorto.CaminoMasCortoMatriz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problema1Matriz {
    final static int INF = 9999, nV = 12;


    public static void floydWarshall(int graph[][]) {
        int i, j, k;
        int[][] pathMatrix = new int[12][12];

        for (k = 0; k < nV; k++) {
            for (i = 0; i < nV; i++) {
                for (j = 0; j < nV; j++) {
                    if (graph[i][k] + graph[k][j] < graph[i][j]){
                        graph[i][j] = graph[i][k] + graph[k][j];
                        pathMatrix[i][j] = k;
                    }

                }
            }
        }
         printMatrix(graph);
         printMatrix(pathMatrix);
    }

    static void printMatrix(int matrix[][]) {
        for (int i = 0; i < nV; ++i) {
            for (int j = 0; j < nV; ++j) {
                if (matrix[i][j] == INF)
                    System.out.print(" INF ");
                else
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int graph[][] = {
                
                { 0, 300, 600, 700, INF, INF, INF, INF, INF, INF, INF, INF },
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

        int graphHours[][] = {
                { 0, 1, 3, 6, INF, INF, INF, INF, INF, INF, INF, INF },
                { INF, 0, INF, INF, 12, 13, 13, INF, INF, INF, INF, INF },
                { INF, INF, 0, INF, 10, 13, 12, INF, INF, INF, INF, INF },
                { INF, INF, INF, 0, 11, 15, 16, INF, INF, INF, INF, INF },
                { INF, INF, INF, INF, 0, INF, INF, 19, 7, 8, INF, INF },
                { INF, INF, INF, INF, INF, 0, INF, 18, 6, 7, INF, INF },
                { INF, INF, INF, INF, INF, INF, 0, 19, 6, 5, INF, INF },
                { INF, INF, INF, INF, INF, INF, INF, 0, INF, INF, 6, 10 },
                { INF, INF, INF, INF, INF, INF, INF, INF, 0, INF, 1, 1 },
                { INF, INF, INF, INF, INF, INF, INF, INF, INF, 0, 1, 1 },
                { INF, INF, INF, INF, INF, INF, INF, INF, INF, INF, 0, 1 },
                { INF, INF, INF, INF, INF, INF, INF, INF, INF, INF, INF, 0 } };

                int graphDollarsPerHour[][] = {
                    { 0, 1, 3, 6, INF, INF, INF, INF, INF, INF, INF, INF },
                    { INF, 0, INF, INF, 12, 13, 13, INF, INF, INF, INF, INF },
                    { INF, INF, 0, INF, 10, 13, 12, INF, INF, INF, INF, INF },
                    { INF, INF, INF, 0, 11, 15, 16, INF, INF, INF, INF, INF },
                    { INF, INF, INF, INF, 0, INF, INF, 19, 7, 8, INF, INF },
                    { INF, INF, INF, INF, INF, 0, INF, 18, 6, 7, INF, INF },
                    { INF, INF, INF, INF, INF, INF, 0, 19, 6, 5, INF, INF },
                    { INF, INF, INF, INF, INF, INF, INF, 0, INF, INF, 6, 10 },
                    { INF, INF, INF, INF, INF, INF, INF, INF, 0, INF, 1, 1 },
                    { INF, INF, INF, INF, INF, INF, INF, INF, INF, 0, 1, 1 },
                    { INF, INF, INF, INF, INF, INF, INF, INF, INF, INF, 0, 1 },
                    { INF, INF, INF, INF, INF, INF, INF, INF, INF, INF, INF, 0 } };
        floydWarshall(graph);
       // floydWarshall(graphHours);
    }
}
