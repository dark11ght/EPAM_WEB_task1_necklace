package by.shakhrai.dao.impl;

import by.shakhrai.dao.JewelDAO;
import by.shakhrai.entity.JewelAbstract;
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
    public void addJewel(JewelAbstract jewelAbstract) throws DAOException {

    }

    @Override
    public List<JewelAbstract> getAllJewel() throws DAOException {
        return null;
    }

    @Override
    public JewelAbstract getJewelByName(String jewel) throws DAOException {
        return null;
    }

    @Override
    public boolean getJewelByLimpidity(String jewel) throws DAOException {
        return false;
    }

    @Override
    public JewelAbstract getJewelByLimpidity(int minLimpidity, int maxLimpidity) throws DAOException {
        return null;
    }

    @Override
    public void deleteJewel(int Jewel) throws DAOException {

    }
}
