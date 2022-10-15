package Strings;

public class LongestCommonSubsequence {
/*
    public static void main(String[] args) {
        System.out.println(LCSRecursivo(0,0));
        int[][] LCS = new int[x.length][y.length];
        for(int l = 0; l<6-1;l++)
        {
            LCS[l][0] = 0;
        }
        for(int l = 0; l<4-1;l++)
        {
            LCS[0][l] = 0;
        }
        LCSMatriz(0, 0);
    }

    public static int LCSRecursivo(int i, int j) {
        char[] x = {'a','b','d','c','\0'};
        char[] y = {'a','c','d','\0'};
        if (x[i] == '\0' || y[j] == '\0') {
            return 0;
        }
        if (x[i] == y[j]) {
            return 1 + LCSRecursivo(i+1, j+1);
        } else {
            return Math.max(LCSRecursivo(i+1, j),LCSRecursivo(i, j+1));
        }
    }
    public static void LCSMatriz(int i, int j)
    {
        
        char[] x = {'a','b','d','c','\0'};
        char[] y = {'a','c','d','\0'};
        

        if(x[i] == y[j]){
            LCS[i][j] = 1 + LCS[i-1][j-1];
        }
        else{
            LCS[i][j] =Math.max(LCS[i-1][j],LCS[i][j+1]);
        }
        printMatrix(LCS);
        

    }
    static void printMatrix(int matrix[][]) {
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 4; ++j) {
                if (matrix[i][j] == 0)
                    System.out.print(" INF ");
                else
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
*/
}
