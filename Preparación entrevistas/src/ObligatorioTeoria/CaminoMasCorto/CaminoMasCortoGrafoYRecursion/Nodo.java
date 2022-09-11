package ObligatorioTeoria.CaminoMasCorto.CaminoMasCortoGrafoYRecursion;

import java.util.ArrayList;
import java.util.List;

public class Nodo {
    private String nombre;
    private List<Vertice> nodosAdyacentes;
    
    public Nodo(String nom)
    {
        this.nombre = nom;
        nodosAdyacentes = new ArrayList<>();
    }

    public void agregarNodoAdyacente(Vertice vertice)
    {
        nodosAdyacentes.add(vertice);
    }
    public List<Vertice> getNodosAdyacentes() {
        return nodosAdyacentes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
}
