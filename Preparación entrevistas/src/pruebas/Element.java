package pruebas;
public class Element {
    private int  weight;
    private int benefit;
    
    public Element(int weight, int benefit)
    {
        this.weight = weight;
        this.benefit = benefit;
    }

    public int getBenefit() {
        return benefit;
    }
    public void setBenefit(int benefit) {
        this.benefit = benefit;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    
}
