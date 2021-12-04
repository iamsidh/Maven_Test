import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Base {

    public WebDriver driver;

    public Base(){

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        System.out.println("Browser Launched");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
}
