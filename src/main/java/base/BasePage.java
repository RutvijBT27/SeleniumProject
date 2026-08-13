package base;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BasePage{
    protected WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }
    protected void waitForElementToBeClickable(By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    protected void click(By locator){
        waitForElementToBeClickable(locator);
        driver.findElement(locator).click();
    }
}