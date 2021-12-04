import jdk.nashorn.internal.runtime.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Snapdeal {

    public static WebDriver driver;

    @BeforeClass
    public static void launchbrowser(){

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        System.out.println("Browser Launched");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        System.out.println("URL launched");

        driver.get("https://www.snapdeal.com/");


    }

    @Test
    public static void TestSnapdeal(){


        WebElement signin = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(signin).perform();

        ArrayList<String> ExpectedList = Expectedmenulist();

        ArrayList<String> ActualList = ActualMenuList();


        try {
            Assert.assertEquals(ExpectedList, ActualList);
        } catch (AssertionError e) {
            System.out.println("Options are Not equal");
            throw e;
        }
        System.out.println("Options are Equal");


        driver.quit();


    }

    public static ArrayList<String> Expectedmenulist() {
        ArrayList<String> options = new ArrayList<String>();

        options.add("Your Account");

        options.add("Your Orders");

        options.add("Shortlist");

        options.add("SD Cash");

        return options;
    }

    public static ArrayList<String> ActualMenuList() {

        ArrayList<String> names = new ArrayList<>();

        List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,'dropdownWrapper')]/div[2]/div/ul/li"));

        
        for (int index = 0; index < list.size(); index++) {
            names.add(list.get(index).getText());
        }
        return names;


    }

    @AfterClass
    public static void CloseBrowser(){

        driver.quit();
    }
}
