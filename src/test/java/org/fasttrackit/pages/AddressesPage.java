package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddressesPage extends PageObject {

    @FindBy (css=".col-1 a")
    private WebElementFacade editBillingAddressLink;

    @FindBy (css=".u-column1 address")
    private List<WebElementFacade> savedBillingAddress;

    @FindBy (css=".col-2 a")
    private WebElementFacade editShippingAddressLink;

    @FindBy (css=".col-2 address")
    private List<WebElementFacade> savedShippingAddress;

    public void clickEditBillingLink(){
        clickOn(editBillingAddressLink);
    }

    public boolean savedBillingAddress(String name, String street, String city, String zipcode){
        for (WebElementFacade webElementFacade : savedBillingAddress) {
            if (webElementFacade.findElement(By.cssSelector(".u-column1 address br:first-child")).getText().contains(name) && webElementFacade.findElement(By.cssSelector(".u-column1 address br:nth-child(2)")).getText().contains(street) && webElementFacade.findElement(By.cssSelector(".u-column1 address br:nth-child(3)")).getText().contains(city) && webElementFacade.findElement(By.cssSelector(".u-column1 address br:last-child")).getText().contains(zipcode));
            return true;
        }
        return false;
    }

    public void clickEditShippingAddressLink(){
        clickOn(editShippingAddressLink);
    }

    public boolean savedShippingAddress(String name, String street, String city, String zipcode){
        for(WebElementFacade webElementFacade:savedShippingAddress){
            if(webElementFacade.findElement(By.cssSelector(".col-2 address br:first-child")).getText().contains(name) && webElementFacade.findElement(By.cssSelector(".col-2 address br:nth-child(2)")).getText().contains(street) && webElementFacade.findElement(By.cssSelector(".col-2 address br:nth-child(3)")).getText().contains(city) && webElementFacade.findElement(By.cssSelector(".col-2 address br:last-child")).getText().contains(zipcode));
            return true;
        }return  false;
    }
}
