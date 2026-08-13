package pages;
import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class InputFieldsPage extends BasePage {
    public InputFieldsPage(WebDriver driver) {
        super(driver);
    }
    private By movieNameInput = By.id("movieNameInput");
    public void enterMovieName(String movieName){
        driver.findElement(movieNameInput).clear();
        driver.findElement(movieNameInput).sendKeys(movieName);
    }
    public String getMovieName(){
        return driver.findElement(movieNameInput).getAttribute("value");
    }
}