import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Reports {

    @Test (priority = 1)
    public  void  setup(){

        System.out.println("im inside setup");
    }

    @Test (priority = 0)
    public void setup2(){

        System.out.println("inside setup 2");
    }
}
