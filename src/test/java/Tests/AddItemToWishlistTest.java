package Tests;

import HelpMethods.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AddItemToWishlistTest extends SharedData {

    @Test
    public void testMethod() {
        //Pick 3 item cards

//        List<WebElement> addTowishlistButton = driver.findElements(By.xpath("//a[@class='add_to_wishlist single_add_to_wishlist']"));
//        WebElement addedMessage = driver.findElement(By.id("yith-wcwl-message"));
//
//        for (Integer index = 0; index < addTowishlistButton.size(); index++) {
//            if (index.equals(1) || index.equals(2) || index.equals(4)) {
//                addTowishlistButton.get(index).click();
//                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//                wait.until(ExpectedConditions.visibilityOf(addedMessage));
//            }
//
//        }
//        //Click to view wishlist
//
//        List<WebElement> wishListButton = driver.findElements(By.xpath("//ul[@class='pull-right noo-topbar-right']/li"));
//        wishListButton.get(0).click();
//        ElementMethods elementMethods = new ElementMethods(driver);
//        elementMethods.scrollByPixels(0,480);







    }
}






        //for

//        String expectedLanguage = "Arabic";
//        String expectedLanguage2= "English";
//
//        List<WebElement>languageOptions= driver.findElements(By.cssSelector(".ui-corner-all"));
//        for (Integer index=0; index<languageOptions.size();index++){
//            if (languageOptions.get(index).getText().equals(expectedLanguage) ||
//                    languageOptions.get(index).getText().equals(expectedLanguage2)){
//                languageOptions.get(index).click();
//            }
//
//        }




        //Add items to wishlist

        //Navigate to wishlist

        //Look on the wishlist table

        //assert wishlist table size = added items size




