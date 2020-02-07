package by.shakhrai.dao.impl;

import by.shakhrai.dao.JewelDAO;
import by.shakhrai.entity.JewelType;
import by.shakhrai.entity.impl.*;
import by.shakhrai.exceptoin.DAOException;
import by.shakhrai.exceptoin.InputFileReaderException;
import by.shakhrai.input.InputFileReader;
import org.apache.log4j.Logger;

import java.io.File;
import java.util.ArrayList;


public class FileJewelDAOImpl implements JewelDAO {
    private final static InputFileReader FILE_INPUT = InputFileReader.INSTANCE;
    private File jewelFile;

    final static Logger logger = Logger.getLogger(FileJewelDAOImpl.class);


    public FileJewelDAOImpl(File jewelFile) {
        this.jewelFile = jewelFile;
    }

    public FileJewelDAOImpl(String path) {
        this.jewelFile = new File(path);

    }


    @Override
    public ArrayList <JewelAbstract> getAll() throws DAOException {

        ArrayList <String> arrayList;

        ArrayList <JewelAbstract> jewelAbstracts = new ArrayList <>();
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


        for (String line : arrayList) {
            String[] temp = line.split(" ");
            if (JewelType.valueOf(temp[0].toUpperCase()) == JewelType.PEARL) {
                String type = temp[0];
                double weight = Double.parseDouble(temp[1]);
                double cost = Double.parseDouble(temp[2]);
                int limpidity = Integer.parseInt(temp[3]);
                String color = temp[4];
                Pearl pearl = new Pearl(type,weight, cost, limpidity, color);
                jewelAbstracts.add(pearl);
            }

            if ((JewelType.valueOf(temp[0].toUpperCase()) == JewelType.AMBER)) {
                String type = temp[0];
                double weight = Double.parseDouble(temp[1]);
                double cost = Double.parseDouble(temp[2]);
                int limpidity = Integer.parseInt(temp[3]);
                String color = temp[4];
                Amber amber = new Amber(type, weight, cost, limpidity, color);
                jewelAbstracts.add(amber);
            }
            if ((JewelType.valueOf(temp[0].toUpperCase()) == JewelType.ARTIFICIAL_STONES)) {
                String type = temp[0];
                double weight = Double.parseDouble(temp[1]);
                double cost = Double.parseDouble(temp[2]);
                int limpidity = Integer.parseInt(temp[3]);
                String artificialStonesName = temp[4];
                ArtificialStones artificialStones = new ArtificialStones(type, weight, cost, limpidity, artificialStonesName);
                jewelAbstracts.add(artificialStones);
            }
            if ((JewelType.valueOf(temp[0].toUpperCase()) == JewelType.NATURAL_STONES)) {
                String type = temp[0];
                double weight = Double.parseDouble(temp[1]);
                double cost = Double.parseDouble(temp[2]);
                int limpidity = Integer.parseInt(temp[3]);
                String color = temp[4];
                NaturalStones naturalStones = new NaturalStones(type, weight, cost, limpidity, color);
                jewelAbstracts.add(naturalStones);
            } else {
                throw new DAOException("Unknown data");
            }

        }

        return jewelAbstracts;
    }
}
