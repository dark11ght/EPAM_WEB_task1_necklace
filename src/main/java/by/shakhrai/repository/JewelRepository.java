package by.shakhrai.repository;

import by.shakhrai.entity.Jewel;
import by.shakhrai.entity.Necklace;

import java.util.ArrayList;

public interface JewelRepository {

    ArrayList<Jewel> getNecklaseJewel();
    void addJewel (Jewel jewel);
    void removeJewel (Jewel jewel);


}
