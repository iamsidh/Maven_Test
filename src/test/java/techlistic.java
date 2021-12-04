import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class techlistic extends Base {


    @Test
    public void techlisticTest() {

        Base base = new Base();

        driver.get("https://www.techlistic.com/");

        WebElement javatext = driver.findElement(By.linkText("Java"));

        Assert.assertEquals(javatext, "Java");
    }

}
