package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.HomePage;

public class CheckoutSteps {

    private HomePage homePage;
    private CheckoutPage checkoutPage;

    @Step
    public void clickonCheckoutButton(){
        homePage.clickCheckoutButton();
    }



}
