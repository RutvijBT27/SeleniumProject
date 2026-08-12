import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    @Test
    public void openGoolgle(){
        WebDriver driver = new ChromeDriver();
        driver.get ("https://www.google.com");
        System.out.println("Page title is : " + driver.getTitle());
        driver.quit();
    }    
}
