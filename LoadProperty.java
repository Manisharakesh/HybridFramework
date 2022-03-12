package AmazonPages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty extends BasePage{

        static Properties props;
        static FileInputStream input;
        static String fileName = "config.properties";
        static String fileLocation = "C:\\Users\\mrkun\\HybridCucumberPomFramework\\src\\test\\resources\\TestData\\config.properties";

        public String getProperty(String keyName) {
            props = new Properties();
            try {
                input = new FileInputStream(fileLocation);
                props.load(input);
                input.close();
            } catch (IOException e) {
                e.printStackTrace();}
            return props.getProperty(keyName);
        }
    }


