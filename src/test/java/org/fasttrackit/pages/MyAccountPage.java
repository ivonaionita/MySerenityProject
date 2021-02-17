package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {

    @FindBy (css=".woocommerce-MyAccount-content p:nth-child(1)")
    private WebElementFacade helloMessage;

    public void verifyHelloMessage() {
        helloMessage.shouldContainText("Hello");

    }


}
