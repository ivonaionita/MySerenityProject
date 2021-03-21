package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BillingAddressPage extends PageObject {

    @FindBy (css="#billing_first_name")
    private WebElementFacade billingAddressFirstNameField;

    @FindBy (css="#billing_last_name")
    private  WebElementFacade billingAddressLastNameField;

    @FindBy (css="#billing_address_1")
    private WebElementFacade billingAddressStreetField;

    @FindBy (css="#billing_city")
    private WebElementFacade billingAddressCityField;

    @FindBy(css="#billing_postcode")
    private WebElementFacade billingAddressZipcodeField;

    @FindBy (css="#billing_phone")
    private WebElementFacade billingAddresPhoneField;

    @FindBy (css=".button")
    private WebElementFacade billingAddressSaveButton;

    public void setBillingAddressFirstNameField(String firstName){
        typeInto(billingAddressFirstNameField,firstName);
    }

    public void setBillingAddressLastNameField(String lastName){
        typeInto(billingAddressLastNameField,lastName);
    }

    public void setBillingAddressStreetField(String street){
        typeInto(billingAddressStreetField,street);
    }

    public void setBillingAddressCityField(String city){
        typeInto(billingAddressCityField,city);
    }

    public void setBillingAddressZipcodeField(String zipcode){
        typeInto(billingAddressZipcodeField,zipcode);
    }

    public void setBillingAddresPhoneField(String phone){
        typeInto(billingAddresPhoneField,phone);
    }

    public void clickBillingAddressSaveButton(){
        clickOn(billingAddressSaveButton);
    }






}
