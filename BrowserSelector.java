package AmazonPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserSelector extends BasePage {
    LoadProperty loadProperty = new LoadProperty();

    public static final String USERNAME = "manishapatel_v0lndC";
    public static final String AUTOMATE_KEY = "5xXa6ih43wCdzWpu5Vx4";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";


    public static final boolean browserStack = true;

    String browserName = loadProperty.getProperty("browser");
    DesiredCapabilities caps = new DesiredCapabilities();

    public void openSelectorBrowser(){
        if(browserStack){
            if(browserName.equalsIgnoreCase("chrome")){
                // DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Chrome");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("resolution", "1920x1200");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.14.0");

            }else if(browserName.equalsIgnoreCase("edge")){
                // DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Edge");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("resolution", "1920x1200");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.5.2");

            }
            else if(browserName.equalsIgnoreCase("Firefox")){
                // DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Edge");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("resolution", "1920x1200");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.5.2");

            }
            try{
                driver = new RemoteWebDriver( new URL(URL),caps);

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            driver.get("https://www.amazon.co.uk/");

        }else{
            if (browserName.equals("chrome")){
                WebDriverManager.chromedriver().setup();//setting path
                driver = new ChromeDriver();//initiasing the driver with browser

            }else if (browserName.equals("edge")){
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }else if (browserName.equals("firefox")){
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
            else{
                System.out.println( browserName + "Browser is invalid,please enter correct browser");
            }

            driver.get("https://www.amazon.co.uk/");
        }
    }
}



