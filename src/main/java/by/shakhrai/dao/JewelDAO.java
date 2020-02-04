package by.shakhrai.dao;

import by.shakhrai.entity.Jewel;
import by.shakhrai.exceptoin.DAOException;

import java.util.List;

public interface JewelDAO {
    void addJewel(Jewel jewel) throws DAOException;

    List<Jewel> getAllJewel() throws DAOException;

    Jewel getJewel(String jewel) throws DAOException;

    boolean isJewel(String jewel) throws DAOException;

    boolean isJewel(int minLimpidity, int maxLimpidity) throws DAOException;

    void deleteJewel(int Jewel) throws DAOException;
}
