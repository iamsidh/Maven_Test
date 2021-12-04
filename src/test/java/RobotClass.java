import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class RobotClass {

    public static void main(String[] args) throws AWTException, InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().deleteAllCookies();

        driver.manage().window().maximize();

        driver.get("https://www.edureka.co/");

        driver.findElement(By.xpath("//a[@class='ga_courses_click']")).click();

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_DOWN);

        Thread.sleep(2000);

        robot.keyPress(KeyEvent.VK_TAB);

        Thread.sleep(2000);

        robot.keyPress(KeyEvent.VK_ENTER);

    }
}
