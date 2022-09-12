package ObligatorioTeoria.ArrayGatosYRatonesComerADistanciaN;

import java.util.ArrayList;

public class Problema2 {
    private final static String raton = "R";
    private final static String gato = "G";
    private final static String comido = "C";

    public static void main(String[] args) {
        int distancia = 3;
        ArrayList<String> gatosRatones = obtenerArray();

        System.out.println("Array Inicial: "+ gatosRatones);

        comer(gatosRatones, distancia);

        System.out.println("Array final: " + gatosRatones);
        
        int ratonesVivos = 0;
        int ratonesComidos = 0;
        for(String s : gatosRatones)
        {
            if(s.equals(raton)){
                ratonesVivos +=1;
            }
            if(s.equals(comido)){
                ratonesComidos +=1;
            }
        }
        System.out.println("Ratones vivos: " + ratonesVivos);
        System.out.println("Ratones comidos: " + ratonesComidos);

    }
    public static void comer(ArrayList<String> gatosRatones, int dist)
    {
        for(int pos = 0; pos < gatosRatones.size(); pos++)
        {
            System.out.println("Iteración: " + pos +" Array: "+ gatosRatones);
            if(gatosRatones.get(pos).equals(gato))
            {
                if(!comerIzquierda(gatosRatones,pos,dist))
                {
                    comerDerecha(gatosRatones, pos, dist);
                }
            }
        }
    }

    private static boolean comerIzquierda(ArrayList<String> gatosRatones, int pos, int dist) 
    {
        int left = pos - dist;
        while(left < pos)
        {
            try{
                String elem = gatosRatones.get(left);
                if(elem.equals(raton))
                {
                    gatosRatones.set(left, comido);
                    return true;
                }
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("Elemento fuera de rango, elemento: "+ pos + " indice izquierdo: " + left);
            }
            left++;
        }
        return false;
    }

    private static void comerDerecha(ArrayList<String> gatosRatones, int pos, int dist) 
    {
        int right = pos + dist;
        while(pos < right)
        {
            try{
                String elem = gatosRatones.get(right);
                if(elem.equals(raton))
                {
                    gatosRatones.set(right, comido);
                }
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("Elemento fuera de rango, elemento: "+ pos + " indice derecho: " + right);
            }
            right--;
        }
    }

    public static ArrayList<String> obtenerArray()
    {
        ArrayList<String> gatosRatones = new ArrayList<>();
        gatosRatones.add(raton);
        gatosRatones.add(raton);
        gatosRatones.add(gato);
        gatosRatones.add(raton);
        gatosRatones.add(gato);
        gatosRatones.add(gato);
        gatosRatones.add(raton);
        gatosRatones.add(gato);
      //  gatosRatones.add(gato);
        gatosRatones.add(raton);
    


        return gatosRatones;
    }

    
}


