package by.shakhrai.entity.impl;

import java.util.Objects;

public abstract class JewelAbstract {
    private double weight;
    private double cost;
    private int limpidity;


    public JewelAbstract(double weight, double cost, int limpidity) {
        this.weight = weight;
        this.cost = cost;
        this.limpidity = limpidity;
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
                limpidity == that.limpidity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, cost, limpidity);
    }

    @Override
    public String toString() {
        return "JewelAbstract{" +
                "weight=" + weight +
                ", cost=" + cost +
                ", limpidity=" + limpidity +
                '}';
    }
}
