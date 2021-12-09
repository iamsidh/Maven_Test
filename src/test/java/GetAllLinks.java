import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GetAllLinks {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://katmoviehd.one/");

      /*  List<WebElement> list = driver.findElements(By.tagName("a"));

        System.out.println("All links size is " + list.size());

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i).getText());
        }*/

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,400)");

    }



}

