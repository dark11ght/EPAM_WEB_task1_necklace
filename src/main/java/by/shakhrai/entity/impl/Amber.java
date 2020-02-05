package by.shakhrai.entity.impl;

import by.shakhrai.entity.Jewel;

import java.io.Serializable;
import java.util.Objects;

public class Amber extends JewelAbstract implements Serializable, Jewel {
    private String color;


    public Amber(double weight, double cost, int limpidity) {
        super(weight, cost, limpidity);
    }

    public Amber(double weight, double cost, int limpidity, String color) {
        super(weight, cost, limpidity);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amber amber = (Amber) o;
        return Objects.equals(color, amber.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Amber{" +
                "color='" + color + '\'' +
                '}';
    }
}
