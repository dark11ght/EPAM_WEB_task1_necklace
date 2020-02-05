package by.shakhrai.entity.impl;

import by.shakhrai.entity.Jewel;

import java.io.Serializable;
import java.util.Objects;

public class NaturalStones extends JewelAbstract implements Serializable, Jewel {
    private String naturalStonesName;


    public NaturalStones(double weight, double cost, int limpidity) {
        super(weight, cost, limpidity);
    }


    public NaturalStones(double weight, double cost, int limpidity, String naturalStonesName) {
        super(weight, cost, limpidity);
        this.naturalStonesName = naturalStonesName;
    }

    public String getNaturalStonesName() {
        return naturalStonesName;
    }

    public void setNaturalStonesName(String naturalStonesName) {
        this.naturalStonesName = naturalStonesName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NaturalStones that = (NaturalStones) o;
        return Objects.equals(naturalStonesName, that.naturalStonesName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), naturalStonesName);
    }

    @Override
    public String toString() {
        return "NaturalStones{" +
                "naturalStonesName='" + naturalStonesName + '\'' +
                '}';
    }
}
