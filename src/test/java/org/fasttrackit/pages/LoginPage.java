package org.fasttrackit.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?page_id=7")
public class LoginPage extends PageObject {

    @FindBy(id="username")
    private WebElementFacade loginEmailField;

    @FindBy (id="password")
    private WebElementFacade loginPasswordField;

    @FindBy (css=".form-row [name=\"login\"]")
    private WebElementFacade loginButton;

    @FindBy (id ="reg_email")
    private  WebElementFacade registerEmailField;

    @FindBy (id="reg_password")
    private WebElementFacade registerPasswordField;

    @FindBy (css = ".form-row [name=\"register\"]")
    private WebElementFacade  registerButton;

    @FindBy (css=".woocommerce-error ")
    private WebElementFacade wrongPassMessage;

    @FindBy (css=".woocommerce-error li")
    private WebElementFacade alreadyExistingEmailMessage;

    @FindBy(css=".woocommerce-password-strength")
    private WebElementFacade passStrengthMessage;

    @FindBy (css=".lost_password a")
    private WebElementFacade lostPasswordLink;

    @FindBy(css=".woocommerce-error li ")
    private WebElementFacade invalidEmailMessage;

    public void completeLgnEmailField(String email){

        typeInto(loginEmailField,email);
    }

    public void completeLgnPasswordField(String password){

        typeInto(loginPasswordField,password);
    }

    public void clickLoginButton(){
        clickOn(loginButton);

    }

    public void completeRegEmailField(String email){
        typeInto(registerEmailField,email);
    }


    public void completeRegPasswordField(String password){
        typeInto(registerPasswordField,password);
    }

    public void clickRegisterButton(){
        clickOn(registerButton);
    }

    public void invalidPassMessage(String email){
        wrongPassMessage.shouldContainText("The password you entered for the email address "+email+" is incorrect");
    }

    public void alreadyExistingEmailError(){
       alreadyExistingEmailMessage.shouldContainText("Error: An account is already registered with your email address. Please log in.");
    }

    public void invalidEmailError(){
        invalidEmailMessage.shouldContainText("Invalid email address");
    }

    public void passwordStrengthMessage(){
        passStrengthMessage.isDisplayed();
    }

    public void clickLostPasswordLink(){
        clickOn(lostPasswordLink);
    }




}
