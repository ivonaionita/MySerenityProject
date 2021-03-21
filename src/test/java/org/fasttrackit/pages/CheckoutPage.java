package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacadeWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class CheckoutPage extends PageObject {


    @FindBy (css=".woocommerce-order-details h2")
    private WebElementFacade confirmationmessage;



    public void orderIsPlacedMessage(){
        confirmationmessage.shouldContainText("Order details");
    }

    public void stayForElement(){
        waitFor(confirmationmessage);
    }





}
