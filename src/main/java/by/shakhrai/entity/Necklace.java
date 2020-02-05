package by.shakhrai.entity;

import by.shakhrai.entity.impl.JewelAbstract;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Necklace implements Serializable {
    private List<JewelAbstract> jewelAbstracts = new ArrayList<>();

    public Necklace() {
    }

    public List<JewelAbstract> getJewelAbstracts() {
        return jewelAbstracts;
    }

    public void setJewelAbstracts(List<JewelAbstract> jewelAbstracts) {
        this.jewelAbstracts = jewelAbstracts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Necklace necklace = (Necklace) o;
        return Objects.equals(jewelAbstracts, necklace.jewelAbstracts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jewelAbstracts);
    }

    @Override
    public String toString() {
        return "Necklace{" +
                "jewelAbstracts=" + jewelAbstracts +
                '}';
    }
}
