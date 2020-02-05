package by.shakhrai.dao;

import by.shakhrai.exceptoin.DAOException;

import java.util.ArrayList;

public interface JewelDAO {
    ArrayList<String> getAllJewel() throws DAOException;
}
