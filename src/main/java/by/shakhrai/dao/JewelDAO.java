package by.shakhrai.dao;

import by.shakhrai.entity.Jewel;
import by.shakhrai.exceptoin.DAOException;

import java.util.ArrayList;

public interface JewelDAO {
    ArrayList<Jewel> getAll() throws DAOException;
}
