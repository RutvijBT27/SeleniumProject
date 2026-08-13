
import pages.InputFieldsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputFieldsTest extends BaseTest{
    @Test
    public void verifyMovieNameInput(){
        driver.get(baseURL + "/input-fields");
        InputFieldsPage page = new InputFieldsPage(driver);
        page.enterMovieName("The Odyssey");
        Assert.assertEquals(page.getMovieName(), "The Odyssey");
    }
    
}