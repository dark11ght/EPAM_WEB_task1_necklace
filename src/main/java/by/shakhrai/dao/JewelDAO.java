package by.shakhrai.dao;

import by.shakhrai.entity.JewelAbstract;
import by.shakhrai.exceptoin.DAOException;

import java.util.List;

public interface JewelDAO {
    void addJewel(JewelAbstract jewelAbstract) throws DAOException;

    List<JewelAbstract> getAllJewel() throws DAOException;

    JewelAbstract getJewelByName(String jewel) throws DAOException;

    boolean getJewelByLimpidity(String jewel) throws DAOException;

    JewelAbstract getJewelByLimpidity(int minLimpidity, int maxLimpidity) throws DAOException;

    void deleteJewel(int Jewel) throws DAOException;
}
