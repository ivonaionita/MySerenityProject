package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {
    @Managed
    private WebDriver webDriver;
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void loginWithValidCredentials(){
        loginSteps.navigateToLogin();
        loginSteps.setEmail("ivona930@gmail.com");
        loginSteps.setPass("123456");
        loginSteps.clickLoginButton();

     //   loginSteps.loginUser("ivona930@gmail.com","123456");

    }


}
