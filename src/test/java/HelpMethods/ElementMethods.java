package HelpMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ElementMethods {
    private WebDriver driver;

    public ElementMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollByPixels(Integer x, Integer y){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+" ,"+y+")", "");
    }
    public void waitVisibleElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void fillElement(WebElement element, String value){
        waitVisibleElement(element);
        element.sendKeys(value);
    }

    public void fillElement(WebElement element, String value, Keys keyboardPress){
        waitVisibleElement(element);
        element.sendKeys(value);
        element.sendKeys(keyboardPress);

    }

    public void clickElement(WebElement element){
        waitVisibleElement(element);
        element.click();
    }

    public void clickElementInList(List<WebElement> elements, Integer index){
        elements.get(index).click();
    }

    public void validateElementMessage(WebElement element, String value){
        waitVisibleElement(element);
        String actualMessage = element.getText();
        Assert.assertEquals(actualMessage, value);
    }
    public void validateElementVisible(WebElement element){
        waitVisibleElement(element);
        Assert.assertTrue(element.isDisplayed());
    }

    public void validateElementContainsMessage(WebElement element, String value){
        waitVisibleElement(element);
        String actualMessage = element.getText();
        Assert.assertTrue(actualMessage.contains(value));
    }
}
