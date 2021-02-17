package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;

public class LoginSteps {

    private HomePage homePage;
    private LoginPage loginPage;


    @Step

    public void navigateToLogin(){
        homePage.open();
        homePage.clickLoginLink();
    }

    @Step
    public void setLgnUsernameField(String username){
        loginPage.completeLgnEmailField(username);
    }

    @Step
    public void setLgnPasswordField(String password){
        loginPage.completeLgnPasswordField(password);
    }

    @Step
    public void proceedToLogin(){
        loginPage.clickLoginButton();
    }

    @Step

    public void loginWithValidCredentials(String username, String password){
        setLgnUsernameField(username);
        setLgnPasswordField(password);
        proceedToLogin();
    }





}
