package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;

public class LoginSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;

    @Step
    public void navigateToLogin(){
        homePage.open();
        homePage.clickAccountButton();
        homePage.clickLoginLink();
    }

    @Step
    public void  setEmail(String email){
        loginPage.setEmailField(email);
    }

    @Step
    public void setPass(String password){
        loginPage.setPasswordField(password);
    }

    @Step
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Step
    public void loginUser(String email, String password){
        navigateToLogin();
        setEmail(email);
        setPass(password);
        clickLoginButton();
    }

    @Step
    public void verifyHellomsg(String userName){
        accountPage.verifiyHelloMsg(userName);
    }
}
