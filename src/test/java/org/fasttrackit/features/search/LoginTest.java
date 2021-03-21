package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.ShopSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


public class LoginTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private ShopSteps shopSteps;

    @Test
    public void loginWithValidCredentials() {
        loginSteps.navigateToLogin();
        loginSteps.setLgnUsernameField(EnvironmentConstants.USER_EMAIL);
        loginSteps.setLgnPasswordField(EnvironmentConstants.USER_PASS);
        loginSteps.proceedToLogin();
        loginSteps.verifyLoginMessage();

        //  loginSteps.loginWithValidCredentials(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
    }

     @Test
    public void loginWithInvalidPassword(){
        loginSteps.navigateToLogin();
        loginSteps.setLgnUsernameField(EnvironmentConstants.USER_EMAIL);
        loginSteps.setLgnPasswordField("abcd");
        loginSteps.proceedToLogin();
        loginSteps.verifyWrongPassMessage(EnvironmentConstants.USER_EMAIL);
     }

     @Test
    public void loginWithInvalidEmail(){
        loginSteps.navigateToLogin();
        loginSteps.setLgnUsernameField("ivona903@gmail.com");
        loginSteps.setLgnPasswordField(EnvironmentConstants.USER_PASS);
        loginSteps.proceedToLogin();
        loginSteps.verifyInvalidEmailMessage();

     }

     @Test
    public void logoutUser(){
        loginSteps.navigateToLogin();
        loginSteps.loginWithValidCredentials(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
        loginSteps.clickOnLogoutButton();
        shopSteps.clickMyAccount();
        loginSteps.verifyLoginPage();

    }

    @Test
    public void lostPassword(){
        loginSteps.navigateToLogin();
        loginSteps.clickOnLostPasswordLink();
        loginSteps.completeUserNameForPass("ivona930@gmail.com");
        loginSteps.clickOnResetPassButton();
        loginSteps.verifyResetPassMessage();
    }



}
