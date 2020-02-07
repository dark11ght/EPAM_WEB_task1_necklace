package by.shakhrai.repository.specification.impl;

import by.shakhrai.entity.impl.JewelAbstract;
import by.shakhrai.repository.specification.JewelSpecification;

public class JewelSpecificationByLimpidity implements JewelSpecification {
    private int minLimpidity;
    private int maxLimpidity;

    public JewelSpecificationByLimpidity(int minLimpidity, int maxLimpidity) {
        this.minLimpidity = minLimpidity;
        this.maxLimpidity = maxLimpidity;
    }


    @Override
    public boolean specification(JewelAbstract jewel) {
        return jewel.getLimpidity() >= minLimpidity && jewel.getLimpidity() <= maxLimpidity;
    }


}
