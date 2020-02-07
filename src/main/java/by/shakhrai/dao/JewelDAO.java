package by.shakhrai.dao;

import by.shakhrai.entity.impl.JewelAbstract;
import by.shakhrai.exceptoin.DAOException;

import java.util.ArrayList;

public interface JewelDAO {
    ArrayList<JewelAbstract> getAll() throws DAOException;
}
