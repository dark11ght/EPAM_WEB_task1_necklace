package by.shakhrai.repository;

import by.shakhrai.repository.specification.JewelSpecification;

import java.util.List;

public interface JewelRepository {

    List<JewelAbstract> query(JewelSpecification specification);
    void addNecklaceJewel(List<JewelAbstract> jewel);
    void addJewel (JewelAbstract jewel);
    void removeJewel (JewelAbstract jewel);


}
