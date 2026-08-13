
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import utils.ConfigReader;
import utils.DriverFactory;
public class BaseTest{
    protected WebDriver driver;
    protected String baseURL;
    @BeforeMethod
    public void setup(){
        
        ConfigReader configReader = new ConfigReader();
        baseURL = configReader.getConfigValue("baseURL");
        String browser = configReader.getConfigValue("browser");

        DriverFactory driverFactory = new DriverFactory();
        driver = driverFactory.launchBrowser(browser);
        driver.get(baseURL);

    }
    @AfterMethod
    public void teardown(){

        driver.quit();
        
    }

}