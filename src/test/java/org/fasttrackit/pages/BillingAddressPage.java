package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    @FindBy(css=".woocommerce-checkout-review-order-table")
    private List<WebElementFacade> reviewOrderTable;

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

    public boolean reviewOrderTableisDisplayed(){
        for(WebElementFacade webElementFacade:reviewOrderTable){
            if (webElementFacade.containsElements(By.cssSelector(".shop_table")))
                return true;
        }return false;
    }






}
