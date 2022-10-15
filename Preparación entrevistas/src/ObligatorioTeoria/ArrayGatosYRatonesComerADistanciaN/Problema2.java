package ObligatorioTeoria.ArrayGatosYRatonesComerADistanciaN;

import java.util.ArrayList;

public class Problema2 {
    private final static String raton = "R";
    private final static String gato = "G";
    private final static String comido = "C";

    public static void main(String[] args) {
        int distancia = 2;
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
    /*
     

        for(int pos = 0; pos < gatosRatones.size(); pos++)                              
        {
            if(gatosRatones.get(pos).equals(gato))
            {
                if(!comerIzquierda(gatosRatones,pos,dist))
                {
                    comerDerecha(gatosRatones, pos, dist);
                }
            }
        }
// comer izquierda
        int izq = pos - dist;
        while(izq < pos)
        {
            String elem = gatosRatones.get(izq);
            if(elem.equals(raton))
            {
                gatosRatones.set(izq, comido);
                return true;
            }
            izq++;
        }
        return false;

// comer derecha
        int der = pos + dist;
        while(pos < der)
        {
            String elem = gatosRatones.get(der);
            if(elem.equals(raton))
            {
                gatosRatones.set(der, comido);
                return true;
            }
            der--;
        }
        return false;

     */

    private static boolean comerIzquierda(ArrayList<String> gatosRatones, int pos, int dist) 
    {
        int izq = pos - dist;
        while(izq < pos)
        {
            try{
                String elem = gatosRatones.get(izq);
                if(elem.equals(raton))
                {
                    gatosRatones.set(izq, comido);
                    return true;
                }
            }
            catch(IndexOutOfBoundsException e){
            }
            izq++;
        }
        return false;
    }

    private static boolean comerDerecha(ArrayList<String> gatosRatones, int pos, int dist) 
    {
        int der = pos + dist;
        while(pos < der)
        {
            try{
                String elem = gatosRatones.get(der);
                if(elem.equals(raton))
                {
                    gatosRatones.set(der, comido);
                    return true;
                }
            }
            catch(IndexOutOfBoundsException e){
            }
            der--;
        }
        return false;
    }

    public static ArrayList<String> obtenerArray()
    {
        ArrayList<String> gatosRatones = new ArrayList<>();
        gatosRatones.add(raton);
      //  gatosRatones.add(raton);
        gatosRatones.add(gato);
        gatosRatones.add(raton);
        gatosRatones.add(raton);
        gatosRatones.add(gato);
        gatosRatones.add(gato);
    //    gatosRatones.add(gato);
     //   gatosRatones.add(gato);
      //  gatosRatones.add(raton);

        return gatosRatones;
    }

    
}


