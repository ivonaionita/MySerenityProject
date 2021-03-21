package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.PlaceOrderPage;

public class PlaceOrderSteps {

    private PlaceOrderPage placeOrderPage;
    private CheckoutPage checkoutPage;

    @Step
    public void setBillingFirstName(String firstName){
        placeOrderPage.completeBillingFirstNameField(firstName);
    }

    @Step
    public void setBillingLastName(String lastName){
        placeOrderPage.completeBillingLastName(lastName);
    }

    @Step
    public void setBillingAddress(String address){
        placeOrderPage.completeBillingAddressField(address);
    }

    @Step
    public void setBillingCity(String city){
        placeOrderPage.completeBillingCityField(city);
    }

    @Step
    public void setBillingZipCode(String zipCode){
        placeOrderPage.completeBillingPCField(zipCode);
    }


    @Step
    public void setBillingTelephone(String telephone){
        placeOrderPage.completeBilingPhoneField(telephone);
    }

    @Step
    public void setBillingEmail(String email){
        placeOrderPage.completeBillingEmailField(email);
    }

    @Step
    public void placeOrder(){
        placeOrderPage.clickPlaceOrder();
    }

    @Step
    public void confirmationOrder(){
        checkoutPage.stayForElement();
        checkoutPage.orderIsPlacedMessage();
    }

    @Step
    public void completeBillingInfo(String firstName,String lastName,String address, String city,String zipCode, String telephone,String email){
        setBillingFirstName(firstName);
        setBillingLastName(lastName);
        setBillingAddress(address);
        setBillingCity(city);
        setBillingZipCode(zipCode);
        setBillingTelephone(telephone);
        setBillingEmail(email);
    }

    @Step
    public void completeBillingInfoAndOrder(String firstName,String lastName,String address, String city,String zipCode, String telephone,String email){
        setBillingFirstName(firstName);
        setBillingLastName(lastName);
        setBillingAddress(address);
        setBillingCity(city);
        setBillingZipCode(zipCode);
        setBillingTelephone(telephone);
        setBillingEmail(email);
        placeOrder();
        confirmationOrder();
    }
}

