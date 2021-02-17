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


}
