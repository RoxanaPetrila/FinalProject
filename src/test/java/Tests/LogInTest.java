package Tests;

import HelpMethods.ElementMethods;
import Pages.DashboardPage;
import Pages.MyAccountPage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends SharedData{

    @Test
    public void test_method(){
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.clickMyAccountButton();

        String usernameValue = "testUsername897";
        String passwordValue = "Pword123456!@";
        String expectedMessage= "Hello ";

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.fillLogInForm(usernameValue, passwordValue);
        myAccountPage.clickRememberMe();
        myAccountPage.clickLoginButton();
        myAccountPage.validateLoginMessage(expectedMessage, usernameValue);



//
//        WebElement myAccountButton = driver.findElement(By.xpath("//a[text()='My Account']"));
//        myAccountButton.click();
//
//        WebElement usernameField = driver.findElement(By.id("username"));
//        String usernameValue = "testUsername897";
//        usernameField.sendKeys(usernameValue);
//
//        WebElement passwordField =driver.findElement(By.id("password"));
//        String passwordValue = "Pword123456!@";
//        passwordField.sendKeys(passwordValue);
//
//        WebElement rememberCheckbox = driver.findElement(By.id("rememberme"));
//        rememberCheckbox.click();
//
//        WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
//        loginButton.click();
//
//        WebElement loginMessage = driver.findElement(By.xpath("//div[@class='woocommerce-MyAccount-content']"));
//        String actualLoginMessage = loginMessage.getText();
//        String expectedLoginMessage = "Hello " + usernameValue;
//
//
//        Assert.assertTrue(actualLoginMessage.contains(expectedLoginMessage));
















    }
}
