package Tests;

import HelpMethods.ElementMethods;
import ObjectData.AddItemToWishlistObject;
import Pages.DashboardPage;
import Pages.MyWishlistPage;
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
import SharedData.Hooks;

public class AddItemToWishlistTest extends Hooks {

    @Test
    public void testMethod() {

        AddItemToWishlistObject addItemToWishlistObject = new AddItemToWishlistObject(testData);

        //visit MyWishlist to see it is empty
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        dashboardPage.clickMyWishlistButton();

        //validate empty message is visible and correct

        MyWishlistPage myWishlistPage = new MyWishlistPage(getDriver());
        myWishlistPage.validateEmptyBodyMessage(addItemToWishlistObject);
        myWishlistPage.returnToDashboard();

        //Pick 3 item cards from dashboard

        dashboardPage.clickAddToWishlistButton(1);
        dashboardPage.clickAddToWishlistButton(2);
        dashboardPage.clickAddToWishlistButton(4);
        dashboardPage.clickMyWishlistButton();

        //validate table body is not empty
        myWishlistPage.tableBodyVisible();
        myWishlistPage.removeIconVisible();
    }
}












