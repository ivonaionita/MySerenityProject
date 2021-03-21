package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageObject {

    @FindBy(id = "tab-description")
    private WebElementFacade productDescription;

    @FindBy (css = ".cart [name=\"add-to-cart\"]")
    private WebElementFacade addToCart;



    public void  isDescriptionDisplayed(){
        productDescription.shouldContainText("Description");
    }

    public void clickAddToCart(){
        clickOn(addToCart);
    }


}
