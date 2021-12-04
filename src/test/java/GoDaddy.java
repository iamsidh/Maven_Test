import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoDaddy {

    public static WebDriver driver;

    @BeforeClass
    //Test Case 1 - Open Godaddy.com and maximize browser window.
    public static void launchbrowser(){

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        System.out.println("Browser Launched");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        System.out.println("URL launched");

        driver.get("https://www.godaddy.com/");


    }

    //Test Case 2 - Open Godaddy.com and Print it's Page title.
    @Test
    public static void GetTitle(){

        String title = driver.getTitle();
        System.out.println(title);

        String url = driver.getCurrentUrl();

        System.out.println(url);


    }
    //Test Case 3 - Open Godaddy.com and Validate Page Title
    @Test(invocationCount = 10)
    public static void ValidateTitle(){

        String title = driver.getTitle();

        String url = driver.getCurrentUrl();

        System.out.println(title);

        String actualTitle="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";

        if(title.equals(actualTitle)){

            System.out.println("Title is Correct");
        }
        else {

            System.out.println("title is not correct");
        }

        if(url.equals("https://www.godaddy.com/")){

            System.out.println("URL is correct");

        }else {
            System.out.println("url is not correct");
        }

        String pagesource = driver.getPageSource();

        if(pagesource.contains("GoDaddy IN")){

            System.out.println("page source is correct");
        }


    }



    @AfterClass
    void closeBrowser() {
        driver.close();
    }
}
