package org.fasttrackit.steps.serenity;

import org.fasttrackit.pages.CheckoutPage;

public class CheckoutSteps {

    private CheckoutPage checkoutPage;

    public void completeBillingInformation(){
        checkoutPage.completeAdressField("unirii");
        checkoutPage.completeCityField("cluj");
        checkoutPage.completePostalCodeField("23231");
        checkoutPage.completeCountryField("Romania");
        checkoutPage.completeTelephoneNo("0736648339");
    }

    public void setShippingasBilling(){
        completeBillingInformation();
        checkoutPage.clickShipThisAddress();
    }

    public void continueToCheckout(){
        completeBillingInformation();
        checkoutPage.clickShipThisAddress();
        checkoutPage.clickContinueButton();
    }
}
