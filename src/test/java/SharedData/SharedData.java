package SharedData;

import Logger.LoggerUtility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData {

    private WebDriver driver;


    //precondition before all tests
    public void setup() {
                //visit site
        driver = new ChromeDriver();
        driver.get("https://shop.demoqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LoggerUtility.info("The browser was opened successfully");

        //perform a scroll on site (needed to view all info)
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
    }

    //conditions after each test has been run
    public void clear(){
        driver.quit();
        LoggerUtility.info("The browser was closed successfully");
    }

    public WebDriver getDriver() {
        return driver;
    }
}

