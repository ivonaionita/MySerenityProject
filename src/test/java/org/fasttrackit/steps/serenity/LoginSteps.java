package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.LostPasswordPage;
import org.fasttrackit.pages.MyAccountPage;

public class LoginSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;
    private LostPasswordPage lostPasswordPage;

    @Step
    public void clickLogin(){
        homePage.clickLoginLink();
    }

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

    @Step
    public void verifyLoginMessage(){
        myAccountPage.verifyHelloMessage();

    }

    @Step
    public void verifyWrongPassMessage(String email){
        loginPage.invalidPassMessage(email);
    }

    @Step
    public  void verifyInvalidEmailMessage(){
        loginPage.invalidEmailError();
    }

    @Step
    public void clickOnLogoutButton(){
        homePage.clickLogout();
    }

    @Step
    public void verifyLoginPage(){
        myAccountPage.loginPageDisplayed();
    }

    @Step
    public void clickOnLostPasswordLink(){
      loginPage.clickLostPasswordLink();
    }

    @Step
    public void completeUserNameForPass(String email){
           lostPasswordPage.setUserNameField(email);
    }

    @Step
    public void clickOnResetPassButton(){
        lostPasswordPage.clickResetButoon();
    }

    @Step
    public void verifyResetPassMessage(){
        lostPasswordPage.resetPasswordMessage();
    }




}
