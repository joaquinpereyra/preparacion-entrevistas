package ObligatorioTeoria.CaminoMasCorto.CaminoMasCortoMatriz;

import java.util.*;
import java.lang.*;
import java.io.*;
// Part of Cosmos by OpenGenus Foundation
class FloydWarshall{

    public static void main(String[] args) {
        System.out.println(mult(5,2));
    }
    public static int sq(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return 2*n+sq(n-1)-1;
        }
    }
    public static int mult(int y, float z)
    {
        if(z==0)
        {
            return 0;
        }
        if(z%2 == 1)
        {
            return mult(2*y, z/2) +y;
        }
        else
        {
            return mult(2*y, z/2);
        }
    }
}

