package by.shakhrai.dao.impl;

import by.shakhrai.dao.JewelDAO;
import by.shakhrai.exceptoin.DAOException;
import by.shakhrai.exceptoin.InputFileReaderException;
import by.shakhrai.input.InputFileReader;
import org.apache.log4j.Logger;

import java.io.File;
import java.util.ArrayList;


public class FileJewelDAOImpl implements JewelDAO {
    private final static InputFileReader FILE_INPUT = InputFileReader.INSTANCE;
    private File jewelFile;
    private String daoSeparator;

    final static Logger logger = Logger.getLogger(FileJewelDAOImpl.class);


    public FileJewelDAOImpl(File jewelFile, String daoSeparator) {
        this.jewelFile = jewelFile;
        this.daoSeparator = daoSeparator;
    }

    public FileJewelDAOImpl(String path, String dataSeparator) {
        this.jewelFile = new File(path);
        this.daoSeparator = dataSeparator;
    }

    @Override
    public ArrayList<String> getAllJewel() throws DAOException {
        ArrayList<String> arrayList;
        try {
            arrayList = FILE_INPUT.readFile(jewelFile);
        } catch (InputFileReaderException e) {
            logger.debug("Fail access to the data source ");
            throw new DAOException("Fail access to the data source ");
        }
        if (arrayList == null) {
            logger.debug("Records not found");
            throw new DAOException("Records not found");
        }

        return arrayList;
    }


}
