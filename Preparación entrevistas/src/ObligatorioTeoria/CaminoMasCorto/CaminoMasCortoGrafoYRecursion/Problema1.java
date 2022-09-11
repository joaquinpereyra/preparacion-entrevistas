package ObligatorioTeoria.CaminoMasCorto.CaminoMasCortoGrafoYRecursion;

import java.util.ArrayList;
import java.util.HashMap;

public class Problema1 {

    private final static String Montevideo = "Montevideo";
    private final static String BuenosAires = "Buenos Aires";
    private final static String SanPablo = "San Pablo";
    private final static String Lima = "Lima";
    private final static String Madrid = "Madrid";
    private final static String Frankfurt = "Frankfurt";
    private final static String Roma = "Roma";
    private final static String BandarAbbas = "BandarAbbas";
    private final static String AbuDabi = "Abu Dabi";
    private final static String Dubai = "Dubai";
    private final static String Manama = "Manama";
    private final static String Doha = "Doha";

    public static void main(String[] args) {
        HashMap<String,Nodo> grafo = new HashMap<>();
        grafo = cargarGrafo();
        Nodo mvd = grafo.get(Montevideo);

        //optimiza el costo
        obtenerMenorCosto(grafo,mvd);
        //optimiza el tiempo
        obtenerMenorCostoHoras(grafo, mvd);
        //optimiza tiempo y costo haciendo que sea costo por hora
        obtenerMenorCostoPorTiempo(grafo,mvd);

    }
   
    public static void obtenerMenorCosto(HashMap<String, Nodo> grafo, Nodo mvd)
    {

        ArrayList<Object> caminoOptimo = new ArrayList<>();
        caminoOptimo.add(Integer.MAX_VALUE);
        
        for(Vertice ver : mvd.getNodosAdyacentes())
        {
            ArrayList<Object> camino = new ArrayList<>();
            camino.add(0);
            camino = obtenerMenorCostoDolares(grafo, ver);
            if((int)camino.get(0) < (int)caminoOptimo.get(0))
            {
                caminoOptimo.add(ver.getOrigen());
                caminoOptimo = camino;
            }
        }
        System.out.println("Menor Costo dolares "+ caminoOptimo.get(0));
        System.out.println(mvd.getNombre() + " --> ");
        for(int i = caminoOptimo.size()-1; i > 0 ; i--)
        {
            System.out.println(caminoOptimo.get(i).toString() + " --> ");
        }
    }

    public static ArrayList<Object> obtenerMenorCostoDolares(HashMap<String,Nodo> grafo, Vertice verticeSelec)
    {
        ArrayList<Object> arrayOptimo = new ArrayList<>();
        Nodo nodoActual = grafo.get(verticeSelec.getDestino());
        if(nodoActual.getNodosAdyacentes().isEmpty() )
        {
            arrayOptimo.add(verticeSelec.getCostoDolares());
            arrayOptimo.add(nodoActual.getNombre());
            return arrayOptimo;
        }
            arrayOptimo.add(Integer.MAX_VALUE);
            for(Vertice ver : nodoActual.getNodosAdyacentes())
            {
                ArrayList<Object> arrayTemp = obtenerMenorCostoDolares(grafo, ver);
                arrayTemp.set(0, (int)arrayTemp.get(0)+ verticeSelec.getCostoDolares());
                arrayTemp.add(ver.getOrigen());
                if((int) arrayTemp.get(0) < (int) arrayOptimo.get(0))
                {
                    arrayOptimo = arrayTemp;
                }
            }
        return arrayOptimo;
    }


    public static void obtenerMenorCostoHoras(HashMap<String, Nodo> grafo, Nodo mvd)
    {
        ArrayList<Object> caminoOptimo = new ArrayList<>();
        caminoOptimo.add(Integer.MAX_VALUE);
        
        for(Vertice ver : mvd.getNodosAdyacentes())
        {
            ArrayList<Object> camino = new ArrayList<>();
            camino.add(0);
            camino = obtenerMenorTiempo(grafo, ver);
            if((int)camino.get(0) < (int)caminoOptimo.get(0))
            {
                caminoOptimo.add(ver.getOrigen());
                caminoOptimo = camino;
            }
        }
        System.out.println("Menor tiempo "+ caminoOptimo.get(0));
        System.out.println(mvd.getNombre() + " --> ");
        for(int i = caminoOptimo.size()-1; i > 0 ; i--)
        {
            System.out.println(caminoOptimo.get(i).toString() + " --> ");
        }

    }
    public static ArrayList<Object> obtenerMenorTiempo(HashMap<String,Nodo> grafo, Vertice verticeSelec)
    {
        ArrayList<Object> arrayOptimo = new ArrayList<>();
        Nodo nodoActual = grafo.get(verticeSelec.getDestino());
        if(nodoActual.getNodosAdyacentes().isEmpty() )
        {
            arrayOptimo.add(verticeSelec.getDuracionHoras());
            arrayOptimo.add(nodoActual.getNombre());
            return arrayOptimo;
        }
            arrayOptimo.add(Integer.MAX_VALUE);
            for(Vertice ver : nodoActual.getNodosAdyacentes())
            {
                ArrayList<Object> arrayTemp = obtenerMenorTiempo(grafo, ver);
                arrayTemp.set(0, (int)arrayTemp.get(0)+ verticeSelec.getDuracionHoras());
                arrayTemp.add(ver.getOrigen());
                if((int) arrayTemp.get(0) < (int) arrayOptimo.get(0))
                {
                    arrayOptimo = arrayTemp;
                }
            }
        return arrayOptimo;
    }

    public static void obtenerMenorCostoPorTiempo(HashMap<String, Nodo> grafo, Nodo mvd)
    {

        ArrayList<Object> caminoOptimo = new ArrayList<>();
        caminoOptimo.add(Integer.MAX_VALUE);
        
        for(Vertice ver : mvd.getNodosAdyacentes())
        {
            ArrayList<Object> camino = new ArrayList<>();
            camino.add(0.0);
            camino = obtenerMenorCostoTiempo(grafo, ver);
            if((Float) camino.get(0) <(Float) caminoOptimo.get(0))
            {
                caminoOptimo.add(ver.getOrigen());
                caminoOptimo = camino;
            }
        }
        System.out.println("Menor Costo por tiempo "+ caminoOptimo.get(0));
        System.out.println(mvd.getNombre() + " --> ");
        for(int i = caminoOptimo.size()-1; i > 0 ; i--)
        {
            System.out.println(caminoOptimo.get(i).toString() + " --> ");
        }
    }

    public static ArrayList<Object> obtenerMenorCostoTiempo(HashMap<String,Nodo> grafo, Vertice verticeSelec)
    {
        ArrayList<Object> arrayOptimo = new ArrayList<>();
        Nodo nodoActual = grafo.get(verticeSelec.getDestino());
        if(nodoActual.getNodosAdyacentes().isEmpty() )
        {
            arrayOptimo.add((float)(verticeSelec.getCostoDolares()/verticeSelec.getDuracionHoras()));
            arrayOptimo.add(nodoActual.getNombre());
            return arrayOptimo;
        }
            arrayOptimo.add(Integer.MAX_VALUE);
            for(Vertice ver : nodoActual.getNodosAdyacentes())
            {
                ArrayList<Object> arrayTemp = obtenerMenorCostoTiempo(grafo, ver);
                arrayTemp.set(0, (float)arrayTemp.get(0) +(float) (verticeSelec.getCostoDolares()/verticeSelec.getDuracionHoras()));
                arrayTemp.add(ver.getOrigen());
                if((float) arrayTemp.get(0) <  (float)arrayOptimo.get(0))
                {
                    arrayOptimo = arrayTemp;
                }
            }
        return arrayOptimo;
    }





    public static HashMap<String,Nodo> cargarGrafo()
    {
        HashMap<String,Nodo> grafo = new HashMap<>();

        Nodo montevideo = new Nodo(Montevideo);
        Vertice verMvd_Bs = new Vertice(Montevideo, BuenosAires, 300, 1);
        Vertice verMvd_SanPablo = new Vertice(Montevideo, SanPablo, 600, 3);
        Vertice verMvd_Lima = new Vertice(Montevideo, Lima, 700, 6);
        montevideo.agregarNodoAdyacente(verMvd_Bs);
        montevideo.agregarNodoAdyacente(verMvd_SanPablo);
        montevideo.agregarNodoAdyacente(verMvd_Lima);
        grafo.put(montevideo.getNombre(), montevideo);

        Nodo buenosAires = new Nodo(BuenosAires);
        Vertice verBuenosAires_Madrid = new Vertice(BuenosAires, Madrid,2300, 12);
        Vertice verBuenosAires_Frankfurt = new Vertice(BuenosAires, Frankfurt,2200,13);
        Vertice verBuenosAires_Roma = new Vertice(BuenosAires, Roma,1950, 13);
        buenosAires.agregarNodoAdyacente(verBuenosAires_Madrid);
        buenosAires.agregarNodoAdyacente(verBuenosAires_Frankfurt);
        buenosAires.agregarNodoAdyacente(verBuenosAires_Roma);
        grafo.put(buenosAires.getNombre(), buenosAires);


        Nodo sanPablo = new Nodo(SanPablo);
        Vertice verSanPablo_Madrid = new Vertice(SanPablo, Madrid,2200,10);
        Vertice verSanPablo_Frankfurt = new Vertice(SanPablo, Frankfurt,2100, 13);
        Vertice verSanPablo_Roma = new Vertice(SanPablo, Roma,2500, 12);
        sanPablo.agregarNodoAdyacente(verSanPablo_Madrid);
        sanPablo.agregarNodoAdyacente(verSanPablo_Frankfurt);
        sanPablo.agregarNodoAdyacente(verSanPablo_Roma);
        grafo.put(sanPablo.getNombre(), sanPablo);

        Nodo lima = new Nodo(Lima);
        Vertice verLima_Madrid = new Vertice(Lima,Madrid,2100,11);
        Vertice verLima_Frankfurt = new Vertice(Lima, Frankfurt,1900,15);
        Vertice verLima_Roma = new Vertice(Lima, Roma,1800, 16);
        lima.agregarNodoAdyacente(verLima_Madrid);
        lima.agregarNodoAdyacente(verLima_Frankfurt);
        lima.agregarNodoAdyacente(verLima_Roma);
        grafo.put(lima.getNombre(), lima);

        Nodo madrid = new Nodo(Madrid);
        Vertice verMadrid_BandarAbbas = new Vertice(Madrid, BandarAbbas,3100,19);
        Vertice verMadrid_AbuDabi = new Vertice(Madrid, AbuDabi,5200,7);
        Vertice verMadrid_Dubai = new Vertice(Madrid, Dubai,3950,8);
        madrid.agregarNodoAdyacente(verMadrid_BandarAbbas);
        madrid.agregarNodoAdyacente(verMadrid_AbuDabi);
        madrid.agregarNodoAdyacente(verMadrid_Dubai);
        grafo.put(madrid.getNombre(), madrid);

        Nodo frankfurt = new Nodo(Frankfurt);
        Vertice verFrankfurt_BandarAbbas = new Vertice(Frankfurt, BandarAbbas,3200,18);
        Vertice verFrankfurt_AbuDabi = new Vertice(Frankfurt, AbuDabi,2100,6);
        Vertice verFrankfurt_Dubai = new Vertice(Frankfurt, Dubai,2500,7);
        frankfurt.agregarNodoAdyacente(verFrankfurt_BandarAbbas);
        frankfurt.agregarNodoAdyacente(verFrankfurt_AbuDabi);
        frankfurt.agregarNodoAdyacente(verFrankfurt_Dubai);
        grafo.put(frankfurt.getNombre(), frankfurt);

        Nodo roma = new Nodo(Roma);
        Vertice verRoma_BandarAbbas = new Vertice(Roma, BandarAbbas,2100,19);
        Vertice verRoma_AbuDabi = new Vertice(Roma, AbuDabi,1900,6);
        Vertice verRoma_Dubai = new Vertice(Roma, Dubai,1800,5);
        roma.agregarNodoAdyacente(verRoma_BandarAbbas);
        roma.agregarNodoAdyacente(verRoma_AbuDabi);
        roma.agregarNodoAdyacente(verRoma_Dubai);
        grafo.put(roma.getNombre(), roma);

        Nodo bandarAbbas = new Nodo(BandarAbbas);
        Vertice verBandarAbbas_Doha = new Vertice(BandarAbbas, Doha,5000,10);
        Vertice verBandarAbbas_Manama = new Vertice(BandarAbbas, Manama,3500,6);
        bandarAbbas.agregarNodoAdyacente(verBandarAbbas_Doha);
        bandarAbbas.agregarNodoAdyacente(verBandarAbbas_Manama);
        grafo.put(bandarAbbas.getNombre(), bandarAbbas);

        Nodo abuDabi = new Nodo(AbuDabi);
        Vertice verAbuDabi_Doha = new Vertice(AbuDabi, Doha,9300,1);
        Vertice verAbuDabi_Manama = new Vertice(AbuDabi, Manama,7500,1);
        abuDabi.agregarNodoAdyacente(verAbuDabi_Doha);
        abuDabi.agregarNodoAdyacente(verAbuDabi_Manama);
        grafo.put(abuDabi.getNombre(), abuDabi);

        Nodo dubai = new Nodo(Dubai);
        Vertice verDubai_Doha = new Vertice(Dubai, Doha,9600,1);
        Vertice verDubai_Manama = new Vertice(Dubai, Manama,8800,1);
        dubai.agregarNodoAdyacente(verDubai_Doha);
        dubai.agregarNodoAdyacente(verDubai_Manama);
        grafo.put(dubai.getNombre(), dubai);

        Nodo manama = new Nodo(Manama);
        Vertice verManama_Doha = new Vertice(Manama, Doha, 3400,1);
        manama.agregarNodoAdyacente(verManama_Doha);
        grafo.put(manama.getNombre(), manama);

        Nodo doha = new Nodo(Doha);
        grafo.put(Doha, doha);
        return grafo;
    }
    
}
