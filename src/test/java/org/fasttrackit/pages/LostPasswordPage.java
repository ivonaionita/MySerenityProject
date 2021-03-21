package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LostPasswordPage extends PageObject {

    @FindBy (css="#user_login")
    private WebElementFacade userNameField;

    @FindBy (css=".woocommerce-Button")
    private WebElementFacade resetPasswordButton;

    @FindBy (css=".woocommerce-message ")
    private WebElementFacade resetPassMessage;

    public void setUserNameField(String email){
        typeInto(userNameField,email);
    }

    public void clickResetButoon(){
        clickOn(resetPasswordButton);
    }

    public void resetPasswordMessage(){
        resetPassMessage.shouldContainText("Password reset email has been sent.");
    }
}
