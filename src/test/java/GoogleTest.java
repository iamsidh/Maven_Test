import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("Selenium");

        driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);

        driver.navigate().back();

        driver.quit();

    }
}
