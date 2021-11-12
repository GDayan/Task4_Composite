package by.Dayan.composite.reader;

import by.Dayan.composite.exception.CustomException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class TextReader {
    private static final Logger logger = LogManager.getLogger();

    public List<String> readAll(String filePath) throws CustomException {
        List<String> lines;
        try (FileReader reader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(reader))
        {
            lines = bufferedReader.lines()
                    .collect(Collectors.toList());

        } catch (IOException e) {
            logger.log(Level.FATAL, "qwe");
            throw new CustomException("File doesn't exist " + filePath, e);
        }
        logger.log(Level.INFO, "This lines " + lines + " are correct");
        return lines;
    }
}
