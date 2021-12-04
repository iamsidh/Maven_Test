import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalenderHandle {
    WebDriver driver;

    @BeforeClass
    void launchBrowser() {
        System.out.println("STEP- Open chrome browser");
       // System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("STEP- Open URL");
        driver.get("https://www.goibibo.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void AutocompletTest() throws InterruptedException {
        driver.findElement(By.xpath(".//*[@id='departureCalendar']")).click();
        Thread.sleep(3000);

        String monthYrvalue = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText();

        System.out.println(monthYrvalue);

        String month = null ;//= monthYrvalue.split(" ")[0].trim();
        String yr=null;

       while (!monthYrvalue.contains("June")){

            driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();

            monthYrvalue=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText();

           System.out.println(monthYrvalue);
            yr = monthYrvalue.split(" ")[1].trim();


            }

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"fare_20220625\"]")));

        driver.findElement(By.xpath("//*[@id=\"fare_20220625\"]")).click();

            }

        }



