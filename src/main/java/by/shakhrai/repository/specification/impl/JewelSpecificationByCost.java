package by.shakhrai.repository.specification.impl;

import by.shakhrai.entity.impl.JewelAbstract;
import by.shakhrai.repository.specification.JewelSpecification;

public class JewelSpecificationByCost implements JewelSpecification {
    private double minCost;
    private double maxCost;

    public JewelSpecificationByCost(double minCost, double maxCost) {
        this.minCost = minCost;
        this.maxCost = maxCost;
    }

    @Override
    public boolean specification(JewelAbstract jewel) {
        return jewel.getCost() >= minCost && jewel.getCost() <= maxCost;
    }
}
