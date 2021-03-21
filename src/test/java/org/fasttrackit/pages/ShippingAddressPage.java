package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ShippingAddressPage extends PageObject {

    @FindBy (css="#shipping_first_name")
    private WebElementFacade shippingAddressFirstNameField;

    @FindBy(css="#shipping_last_name")
    private WebElementFacade shippingAddressLastNameField;

    @FindBy(css="#shipping_address_1")
    private WebElementFacade shippingAddresStreetField;

    @FindBy(css="#shipping_city")
    private WebElementFacade shippingAddressCityField;

    @FindBy(css="#shipping_postcode")
    private WebElementFacade shippingAddressZipcodeField;

    @FindBy(css=".button")
    private WebElementFacade saveShippingAddresButton;

    public void setShippingAddressFirstNameField(String firstName){
        typeInto(shippingAddressFirstNameField,firstName);
    }

    public void setShippingAddressLastNameField(String lastName){
        typeInto(shippingAddressLastNameField,lastName);
    }

    public void setShippingAddresStreetField(String street){
        typeInto(shippingAddresStreetField,street);
    }

    public void setShippingAddressCityField(String city){
        typeInto(shippingAddressCityField,city);
    }

    public void setShippingAddressZipcodeField(String zipcode){
        typeInto(shippingAddressZipcodeField,zipcode);
    }

    public void clickSaveShippingAddressBuutton(){
        clickOn(saveShippingAddresButton);
    }

}
