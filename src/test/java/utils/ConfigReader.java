package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    Properties properties;

    public ConfigReader() throws IOException {
        properties = new Properties();
        FileInputStream file = new FileInputStream("src/test/resources/config.properties");
        properties.load(file);
    }

    public String getUsername() {
        return properties.getProperty("username");
    }

    public String getPassword() {
        return properties.getProperty("password");
    }

    public String getUrl() {
        return properties.getProperty("url");
    }
}