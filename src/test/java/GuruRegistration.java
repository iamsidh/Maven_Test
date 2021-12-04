import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class GuruRegistration {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/test/newtours/register.php");

        driver.findElement(By.name("firstName")).sendKeys("Siddhesh");

        driver.findElement(By.name("lastName")).sendKeys("Madgaonkar");

        driver.findElement(By.name("phone")).sendKeys("9404003380");

        driver.findElement(By.id("userName")).sendKeys("abc@abc.com");

        WebElement e = driver.findElement(By.name("country"));

        WebDriverWait wait = new WebDriverWait(driver,30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("country")));


        Select select = new Select(e);

        try {
            select.selectByValue("India");


        }catch (Exception e1){

            System.out.println("execption");
        }






    }
}
