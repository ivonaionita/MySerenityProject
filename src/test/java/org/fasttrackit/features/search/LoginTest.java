package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


public class LoginTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void loginWithValidCredentials(){
        loginSteps.navigateToLogin();
        loginSteps.setLgnUsernameField(EnvironmentConstants.USER_EMAIL);
        loginSteps.setLgnPasswordField(EnvironmentConstants.USER_PASS);
        loginSteps.proceedToLogin();

        //  loginSteps.loginWithValidCredentials(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
    }


}
