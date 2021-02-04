package org.fasttrackit.pages;

import groovy.transform.Field;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.yecht.Data;

import java.awt.*;

public class CheckoutPage extends PageObject {
    @FindBy(id="billing:street1")
    WebElementFacade addressField;
    @FindBy(id="billing:city")
    WebElementFacade  cityField;
    @FindBy(id="billing:postcode")
    WebElementFacade postalCodeField;
    @FindBy(id="billing:country_id")
    WebElementFacade countryField;
    @FindBy(id="billing:telephone")
    WebElementFacade telephoneField;
    @FindBy(css="label[for=\"billing:use_for_shipping_yes\"]")
    WebElementFacade shipThisAddress;
    @FindBy(css = ".buttons-set [title=\"Continue\"]")
    WebElementFacade continueButton;

    public void completeAdressField(String address){
        typeInto(addressField,address);
    }
    public void completeCityField(String city){
        typeInto(cityField,city);
    }
    public void completePostalCodeField(String postalCode){
        typeInto(postalCodeField,postalCode);
    }
    public void completeCountryField(){
        selectFromDropdown(countryField,"Romania");
    }
    public void completeTelephoneNo(String number){
        typeInto(telephoneField,number);

    }
    public void clickShipThisAddress(){
        clickOn(shipThisAddress);
    }
    public void clickContinueButton(){
        clickOn(continueButton);
    }
}
