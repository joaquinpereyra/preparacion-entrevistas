package pruebas;
import java.util.ArrayList;
import java.util.Arrays;

public class BagProblem {
    
    
    
    public static ArrayList<Element> getElements()
    {
        ArrayList<Element> elements = new ArrayList<>();
        Element e1 = new Element(1, 2);
        Element e2 = new Element(3, 5);
        Element e3 = new Element(4, 10);
        Element e4 = new Element(5, 14);
        Element e5 = new Element(7, 15);
        elements.add(e1);
        elements.add(e2);
        elements.add(e3);
        elements.add(e4);
        elements.add(e5);
        return elements;
    }

    public static void calculateOptimalSolution(int bagSize)
    {
        ArrayList<Element> elements = getElements();
        int[][] matrix = new int [elements.size()][bagSize];
        for(int i = 1; i < bagSize; i++)
        {
            for(int j = 0; j < elements.size(); j++)
            {
                Element ele = elements.get(j);
                    matrix[i][j] = Math.max(matrix[i][j], matrix[i][elements.get(i).getWeight()] + ele.getBenefit());
                
                System.out.println("matrix for i = " +i+ ", j = "+j+"\n");
                printMatrix(matrix);
            }

        }
        System.out.println("final matrix\n");
        printMatrix(matrix);

    }


    private static void printMatrix(int[][] matrix) {

        // Loop through all rows
        for (int[] row : matrix)
 
            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }

    public static void main(String[] args) {
        calculateOptimalSolution(8);
    }

}


