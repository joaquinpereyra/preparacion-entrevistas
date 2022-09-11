package ObligatorioTeoria.CaminoMasCorto.CaminoMasCortoGrafoYRecursion;

public class Vertice {
    private String origen;
    private String destino;
    private int costoDolares;
    private int duracionHoras;
    
    public Vertice(String origen, String destino, int costoDolares, int duracionHoras)
    {
        this.origen = origen;
        this.destino = destino;
        this.costoDolares = costoDolares;
        this.duracionHoras = duracionHoras;
    }
    
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    public int getCostoDolares() {
        return costoDolares;
    }
    public void setCostoDolares(int costoDolares) {
        this.costoDolares = costoDolares;
    }
    public int getDuracionHoras() {
        return duracionHoras;
    }
    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

}
