package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.BillingAddressPage;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.HomePage;

public class CheckoutSteps {

    private HomePage homePage;
    private CheckoutPage checkoutPage;
    private BillingAddressPage billingAddressPage;
    private CartPage cartPage;

    @Step
    public void clickonCheckoutButton(){
        homePage.clickCheckoutButton();
    }

    @Step
    public void checkReviewOrderTable(){
        billingAddressPage.reviewOrderTableisDisplayed();

    }



}
