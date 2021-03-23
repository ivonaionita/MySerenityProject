package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;

public class RegisterSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    @Step
    public void navigateToRegister() {
        homePage.open();
        homePage.clickLoginLink();
    }

    @Step
    public void setRegEmailField(String email) {
        loginPage.completeRegEmailField(email);
    }

    @Step
    public void setRegPasswordField(String password) {
        loginPage.completeRegPasswordField(password);
    }

    @Step
    public void proceedToRegister() {
        loginPage.clickRegisterButton();
    }

    @Step
    public void registerWithValidCredentials(String email, String password) {
        setRegEmailField(email);
        setRegPasswordField(password);
        proceedToRegister();
    }

    @Step
    public void verifyRegisterMessage() {
        myAccountPage.verifyHelloMessage();
    }

    @Step
    public void verifyPassStrength(){
        loginPage.passwordStrengthMessage();
    }

    @Step
    public void verifyAlreadyExistingEmailMessage(){
        loginPage.alreadyExistingEmailError();
    }





}
