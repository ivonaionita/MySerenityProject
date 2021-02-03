package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageObject {

    @FindBy(css = "#product-collection-image-412")
    private WebElementFacade product;

    public void selectProduct() {
        clickOn(product);
    }

}