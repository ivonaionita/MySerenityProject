package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class PlaceOrderPage extends PageObject {

    @FindBy (css = "#billing_first_name")
    private WebElementFacade billingFirstNameField;
    @FindBy(css="#billing_last_name")
    private  WebElementFacade billingLastName;
    @FindBy(css="#billing_address_1")
    private  WebElementFacade billingAddressField;
    @FindBy(css="#billing_city")
    private WebElementFacade billingCityField;
    @FindBy(css="#billing_postcode")
    private WebElementFacade billingPCField;
    @FindBy(css="#billing_phone")
    private WebElementFacade billingPhoneField;
    @FindBy(css="#billing_email")
    private  WebElementFacade billingEmailField;
    @FindBy(css="#place_order")
    private WebElementFacade placeOrderButton;


    public void completeBillingFirstNameField(String firstName){
        typeInto(billingFirstNameField,firstName);
    }

    public void completeBillingLastName(String lastName){
        typeInto(billingLastName,lastName);
    }

    public void completeBillingAddressField(String address){
        typeInto(billingAddressField,address);
    }

    public void completeBillingCityField(String city){
        typeInto(billingCityField,city);
    }
    public void completeBillingPCField(String  postCode){
        typeInto(billingPCField,postCode);
    }
    public void completeBilingPhoneField(String phone){
        typeInto(billingPhoneField,phone);
    }
    public void completeBillingEmailField(String email){
        typeInto(billingEmailField,email);
    }
    public void clickPlaceOrder(){
        clickOn(placeOrderButton);
    }



}
