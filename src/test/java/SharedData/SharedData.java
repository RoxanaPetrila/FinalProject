package SharedData;

import Logger.LoggerUtility;
import SharedData.Browser.BrowserFactory;
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
        driver= new BrowserFactory().getBrowserDriver();
        //perform a scroll on site (needed to view all info)
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
    }

    //conditions after each test has been run
    public void clear(){
        driver.quit();
        LoggerUtility.info("The browser has been closed successfully");
    }

    public WebDriver getDriver() {
        return driver;
    }
}

