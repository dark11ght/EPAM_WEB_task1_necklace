package by.shakhrai.entity.impl;

import by.shakhrai.entity.Jewel;

import java.io.Serializable;
import java.util.Objects;

public class ArtificialStones extends JewelAbstract implements Serializable, Jewel {
    private String artificialStonesName;

    public ArtificialStones(double weight, double cost, int limpidity) {
        super(weight, cost, limpidity);
    }

    public ArtificialStones(double weight, double cost, int limpidity, String artificialStonesName) {
        super(weight, cost, limpidity);
        this.artificialStonesName = artificialStonesName;
    }

    public String getArtificialStonesName() {
        return artificialStonesName;
    }

    public void setArtificialStonesName(String artificialStonesName) {
        this.artificialStonesName = artificialStonesName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ArtificialStones that = (ArtificialStones) o;
        return Objects.equals(artificialStonesName, that.artificialStonesName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), artificialStonesName);
    }


    @Override
    public String toString() {
        return "ArtificialStones{" +
                "artificialStonesName='" + artificialStonesName + '\'' +
                '}';
    }
}
