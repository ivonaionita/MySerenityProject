package org.fasttrackit.steps.serenity;

import org.fasttrackit.pages.CheckoutPage;

public class CheckoutSteps {

    private CheckoutPage checkoutPage;

    public void setBillingAddress(String address){
        checkoutPage.completeAdressField(address);
    }

    public void setBillingCity(String city){
        checkoutPage.completeCityField(city);
    }
    public void seteBillingPostalCode(String postalCode){
        checkoutPage.completePostalCodeField(postalCode);
    }

    public void setBillingCountry(){
        checkoutPage.completeCountryField();
    }

    public void setBillingTelephone(String telephone){
        checkoutPage.completeTelephoneNo(telephone);
    }

    public void completeBillingInformation(){
       setBillingAddress("unirii1");
       setBillingCity("cluj");
       seteBillingPostalCode("123");
       setBillingCountry();
       setBillingTelephone("0745208907");
    }

    public void setShippingAsBilling(){
        completeBillingInformation();
        checkoutPage.clickShipThisAddress();
    }

    public void continueToCheckout(){
        completeBillingInformation();
        checkoutPage.clickShipThisAddress();
        checkoutPage.clickContinueButton();
    }
}
