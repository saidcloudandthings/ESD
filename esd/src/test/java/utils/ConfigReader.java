package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;

    public static Properties readProperties(String filePath) {
        try {
            FileInputStream FIS = new FileInputStream(filePath);
            prop = new Properties();
            prop.load(FIS);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop;
    }

    public static String getPropertyValue(String key) {
        return prop.getProperty(key);
    }
}
