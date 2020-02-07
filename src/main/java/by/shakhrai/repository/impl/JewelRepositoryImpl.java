package by.shakhrai.repository.impl;

import by.shakhrai.repository.JewelRepository;
import by.shakhrai.repository.specification.JewelSpecification;

import java.util.ArrayList;
import java.util.List;

public class JewelRepositoryImpl implements JewelRepository {
    private List <JewelAbstract> jewelList = new ArrayList <>();

    public JewelRepositoryImpl() {
    }

    @Override
    public List <JewelAbstract> query(JewelSpecification specification) {
        List <JewelAbstract> result = new ArrayList <>();
        for (JewelAbstract jewel : jewelList) {
            if (specification.specification(jewel)) {
                result.add(jewel);
            }
        }
        return result;

    }

    @Override
    public void addNecklaceJewel(List <JewelAbstract> jewels) {
        for (JewelAbstract jewel : jewels) {
            if (jewel != null) {
                jewelList.add(jewel);
            }
        }
    }


    @Override
    public void addJewel(JewelAbstract jewel) {
        jewelList.add(jewel);
    }

    @Override
    public void removeJewel(JewelAbstract jewel) {
        jewelList.remove(jewel);
    }
}
