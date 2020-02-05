package by.shakhrai.input;

import by.shakhrai.exceptoin.InputFileReaderException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public enum InputFileReader {
    INSTANCE;

    public ArrayList<String> readFile(File file) throws InputFileReaderException {

        if (file == null) {
            throw new InputFileReaderException("File is null");
        }

        ArrayList<String> fileRows = new ArrayList();

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new java.io.FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                fileRows.add(line);
            }
        } catch (IOException e) {
            throw new InputFileReaderException("File is not found", e);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new InputFileReaderException("Can not close reader");
                }
            }
        }
        return fileRows;
    }

}
