package by.shakhrai.dao.impl;

import by.shakhrai.dao.JewelDAO;
import by.shakhrai.entity.Jewel;
import by.shakhrai.entity.impl.Amber;
import by.shakhrai.entity.impl.ArtificialStones;
import by.shakhrai.entity.impl.NaturalStones;
import by.shakhrai.entity.impl.Pearl;
import by.shakhrai.exceptoin.DAOException;
import by.shakhrai.exceptoin.InputFileReaderException;
import by.shakhrai.input.InputFileReader;
import org.apache.log4j.Logger;

import java.io.File;
import java.util.ArrayList;


public class FileJewelDAOImpl implements JewelDAO {
    private final static InputFileReader FILE_INPUT = InputFileReader.INSTANCE;
    private File jewelFile;
    private final static String PEARL = "pearl";
    private final static String AMBER = "amber";
    private final static String ARTIFICIAL_STONES = "artificialStones";
    private final static String NATURAL_STONES = "naturalStones";


    final static Logger logger = Logger.getLogger(FileJewelDAOImpl.class);


    public FileJewelDAOImpl(File jewelFile) {
        this.jewelFile = jewelFile;
    }

    public FileJewelDAOImpl(String path) {
        this.jewelFile = new File(path);

    }


    @Override
    public ArrayList<Jewel> getAll() throws DAOException {
        ArrayList<String> arrayList;

        ArrayList<Jewel> jewels = new ArrayList<>();
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
            if (temp[0].equals(PEARL)) {
                double weight = Double.parseDouble(temp[1]);
                double cost = Double.parseDouble(temp[2]);
                int limpidity = Integer.parseInt(temp[3]);
                String color = temp[4];
                Pearl pearl = new Pearl(weight, cost, limpidity, color);
                jewels.add(pearl);
            }


            if (temp[0].equals(AMBER)) {
                double weight = Double.parseDouble(temp[1]);
                double cost = Double.parseDouble(temp[2]);
                int limpidity = Integer.parseInt(temp[3]);
                String color = temp[4];
                Amber amber = new Amber(weight, cost, limpidity, color);
                jewels.add(amber);
            }
            if (temp[0].equals(ARTIFICIAL_STONES)) {
                double weight = Double.parseDouble(temp[1]);
                double cost = Double.parseDouble(temp[2]);
                int limpidity = Integer.parseInt(temp[3]);
                String artificialStonesName = temp[4];
                ArtificialStones artificialStones = new ArtificialStones(weight, cost, limpidity, artificialStonesName);
                jewels.add(artificialStones);
            }
            if (temp[0].equals(NATURAL_STONES)) {
                double weight = Double.parseDouble(temp[1]);
                double cost = Double.parseDouble(temp[2]);
                int limpidity = Integer.parseInt(temp[3]);
                String color = temp[4];
                NaturalStones naturalStones = new NaturalStones(weight, cost, limpidity, color);
                jewels.add(naturalStones);
            }

        }
        return jewels;
    }
}
