package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageObject {
    @FindBy(css=".success-msg span")
    WebElementFacade successMsg;
    @FindBy(css=".checkout-types.bottom [type=\"button\"]")
    WebElementFacade checkoutButton;

    public void verifySuccessMsg() {
        successMsg.shouldContainText("was added to your shopping cart");
    }
    public void clickCheckoutButton(){
        clickOn(checkoutButton);
    }


}
