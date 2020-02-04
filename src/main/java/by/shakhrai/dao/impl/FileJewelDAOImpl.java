package by.shakhrai.dao.impl;

import by.shakhrai.dao.JewelDAO;
import by.shakhrai.entity.Jewel;
import by.shakhrai.exceptoin.DAOException;

import java.io.File;
import java.util.List;

public class FileJewelDAOImpl implements JewelDAO {

    private File jewelFile;
    private String daoSeparator;


    public FileJewelDAOImpl(File jewelFile, String daoSeparator) {
        this.jewelFile = jewelFile;
        this.daoSeparator = daoSeparator;
    }

    public FileJewelDAOImpl(String path, String dataSeparator) {
        this.jewelFile = new File(path);
        this.daoSeparator = dataSeparator;
    }



    @Override
    public void addJewel(Jewel jewel) throws DAOException {

    }

    @Override
    public List<Jewel> getAllJewel() throws DAOException {
        return null;
    }

    @Override
    public Jewel getJewel(String jewel) throws DAOException {
        return null;
    }

    @Override
    public boolean isJewel(String jewel) throws DAOException {
        return false;
    }

    @Override
    public boolean isJewel(int minLimpidity, int maxLimpidity) throws DAOException {
        return false;
    }

    @Override
    public void deleteJewel(int Jewel) throws DAOException {

    }
}
