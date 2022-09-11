package pruebas;
public class App {
    public static void main(String[] args) throws Exception {
        int[] n = { 1, 5, 3, 6, 4, 8, 6, 9 };
        for (int i = 0; i < n.length; i++) {
        //    System.out.println(n);
            System.out.println("print 1 " + n[i]);
            for (int j = n.length-1; j > i + 1; j--)
            {
                System.out.println("print 2 "+ n[j]);
                if(n[j] < n[j-1])
                {
                    int a = n[j-1];
                    n[j-1] = n[j];
                    n[j] = a;
                }
            }
          // System.out.println(n.toString());
        }
    }
}
