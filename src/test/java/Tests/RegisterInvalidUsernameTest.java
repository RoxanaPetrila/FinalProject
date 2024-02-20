package Tests;


import ObjectData.RegisterInvalidUsernameObject;
import Pages.DashboardPage;
import Pages.MyAccountPage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class RegisterInvalidUsernameTest extends Hooks {
        @Test
    public void testMethod(){

        RegisterInvalidUsernameObject registerInvalidUsernameObject = new RegisterInvalidUsernameObject(testData);

        //navigate to MyAccount page from Dashboard
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        dashboardPage.clickMyAccountButton();

        //fill in the form and submit
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        myAccountPage.fillRegisterForm(registerInvalidUsernameObject);
        myAccountPage.clickRegister();

        //validate error message text is desired text
        myAccountPage.validateInvalidUsernameMessage(registerInvalidUsernameObject.getInvalidUsernameError());



    }
}
