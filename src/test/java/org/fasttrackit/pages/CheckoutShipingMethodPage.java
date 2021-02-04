package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class CheckoutShipingMethodPage extends PageObject {

    @FindBy(css="#shipping-method-buttons-container .button")
    private WebElementFacade shippingMethodContinueButton;


    public void agreeShippingMethod(){
        clickOn(shippingMethodContinueButton);
    }
}

