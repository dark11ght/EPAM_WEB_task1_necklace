package by.shakhrai.entity.impl;

import java.util.Objects;

public abstract class JewelAbstract {
    protected String type;
    protected double weight;
    protected double cost;
    protected int limpidity;

    public JewelAbstract(String type, double weight, double cost, int limpidity) {
        this.type = type;
        this.weight = weight;
        this.cost = cost;
        this.limpidity = limpidity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JewelAbstract that = (JewelAbstract) o;
        return Double.compare(that.weight, weight) == 0 &&
                Double.compare(that.cost, cost) == 0 &&
                limpidity == that.limpidity &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, weight, cost, limpidity);
    }

    @Override
    public String toString() {
        return "JewelAbstract{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", cost=" + cost +
                ", limpidity=" + limpidity +
                '}';
    }
}
