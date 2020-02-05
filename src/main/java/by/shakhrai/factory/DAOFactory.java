package by.shakhrai.factory;

import by.shakhrai.dao.DAOProperty;
import by.shakhrai.dao.impl.FileJewelDAOImpl;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final String daoSeparator = DAOProperty.getStringValue("daoSeparator");
    private final JewelDAO jewelFilePath = new FileJewelDAOImpl(DAOProperty.getStringValue("jewelFilePath"), daoSeparator);

    private DAOFactory() {

    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public JewelDAO getJewelDAO(){
        return jewelFilePath;
    }


}
