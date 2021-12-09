import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FacebookLogin {


    @Test
    public void fbLogin() {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

        driver.findElement(By.name("firstname")).sendKeys("Siddhesh");

        driver.findElement(By.name("lastname")).sendKeys("Siddhesh");

        List<WebElement> list = driver.findElements(By.xpath("//select[@name='birthday_day']/option"));

        System.out.println(list.get(5).getText());

        list.get(5).click();

        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement month = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='birthday_day']")));

        Select select = new Select(month);

        System.out.println(select.isMultiple());

        select.selectByValue("8");

        List<WebElement> allMonths = select.getOptions();

        System.out.println(allMonths.size());


        driver.quit();


    }
}
