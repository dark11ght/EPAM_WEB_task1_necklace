package by.shakhrai.repository.specification.impl;

import by.shakhrai.entity.impl.JewelAbstract;
import by.shakhrai.repository.specification.JewelSpecification;

public class JewelSpecificationByWeight implements JewelSpecification {
    private double minWeight;
    private double maxWeight;

    public JewelSpecificationByWeight(double minWeight, double maxWeight) {
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }


    @Override
    public boolean specification(JewelAbstract jewel) {
        return jewel.getWeight() >= minWeight && jewel.getWeight() <= maxWeight;
    }
}
