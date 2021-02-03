package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class ProductDescriptionPage extends PageObject {
    @FindBy(css = ".product-options-bottom [title=\"Add to Cart\"]")
    WebElementFacade addToCartButton;

    @FindBy(css = ".swatch-label [alt=\"Indigo\"]")
    WebElementFacade selectColor;

    @FindBy(css="#swatch81 .swatch-label")
    WebElementFacade selectSize;

    @FindBy(id="qty")
    WebElementFacade selectQuantity;

    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }

    public void selectProductColor(){
        clickOn(selectColor);
    }

    public void selectproductSize(){
        clickOn(selectSize);
    }


}
