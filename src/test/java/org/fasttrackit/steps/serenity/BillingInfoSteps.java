package org.fasttrackit.steps.serenity;

import org.fasttrackit.pages.BillingInfoPage;

public class BillingInfoSteps {

    private BillingInfoPage billingInfoPage;

    public void completeBillingInformation(){
        billingInfoPage.completeAdressField("unirii");
        billingInfoPage.completeCityField("cluj");
        billingInfoPage.completePostalCodeField("23231");
        billingInfoPage.completeCountryField();
        billingInfoPage.completeTelephoneNo("0736648339");
    }

    public void setShippingasBilling(){
        completeBillingInformation();
        billingInfoPage.clickShipThisAddress();
    }

    public void continueToCheckout(){
        completeBillingInformation();
        billingInfoPage.clickShipThisAddress();
        billingInfoPage.clickContinueButton();
    }
}
