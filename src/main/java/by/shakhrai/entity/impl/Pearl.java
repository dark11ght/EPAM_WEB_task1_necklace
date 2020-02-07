package by.shakhrai.entity.impl;

import java.io.Serializable;
import java.util.Objects;

public class Pearl extends JewelAbstract implements Serializable {
    private String color;

    public Pearl(String type, double weight, double cost, int limpidity) {
        super(type, weight, cost, limpidity);
    }

    public Pearl(String type, double weight, double cost, int limpidity, String color) {
        super(type, weight, cost, limpidity);
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
        Pearl pearl = (Pearl) o;
        return Objects.equals(color, pearl.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }


    @Override
    public String toString() {
        return "Pearl{" +
                "color='" + color + '\'' +
                '}';
    }
}
