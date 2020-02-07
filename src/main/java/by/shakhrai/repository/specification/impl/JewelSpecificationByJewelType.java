package by.shakhrai.repository.specification.impl;

import by.shakhrai.entity.JewelType;
import by.shakhrai.entity.impl.JewelAbstract;
import by.shakhrai.repository.specification.JewelSpecification;

public class JewelSpecificationByJewelType implements JewelSpecification {
    private JewelType jewelType;


    public JewelSpecificationByJewelType(JewelType jewelType) {
        this.jewelType = jewelType;
    }


    @Override
    public boolean specification(JewelAbstract jewel) {
        return jewel.getType().equals(jewelType);
    }
}
