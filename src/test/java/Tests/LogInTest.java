package Tests;

import HelpMethods.ElementMethods;
import ObjectData.LogInObject;
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
import SharedData.Hooks;

public class LogInTest extends Hooks{

    @Test
    public void test_method(){

        LogInObject logInObject = new LogInObject(testData);

        DashboardPage dashboardPage = new DashboardPage(getDriver());
        dashboardPage.clickMyAccountButton();

        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        myAccountPage.fillLogInForm(logInObject);
        myAccountPage.clickRememberMe();
        myAccountPage.clickLoginButton();
        myAccountPage.validateLoginMessage(logInObject.getExpectedMessage(), logInObject.getUsernameValue());




















    }
}
