package by.shakhrai.entity;

public abstract class JewelAbstract {
    protected double weight;
    protected double cost;
    protected int limpidity;


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getLimpidity() {
        return limpidity;
    }

    public void setLimpidity(int limpidity) {
        this.limpidity = limpidity;
    }
}
