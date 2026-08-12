package utils;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private Properties testProperties = new Properties();
    public ConfigReader() {

        String env = System.getProperty("env");
        String fileName = "config-" + env + ".properties";

        InputStream input = getClass()
                .getClassLoader()
                .getResourceAsStream(fileName);

        try {
            testProperties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getConfigValue(String key) {
        return testProperties.getProperty(key);
    }
}
