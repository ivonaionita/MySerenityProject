package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ShopPage extends PageObject {

    @FindBy (css = ".products li:first-child")
    private WebElementFacade firstProductDisplayed;


    @FindBy (css="li:first-child .price-cart a")
    private WebElementFacade addToCartButton;

    @FindBy (css = ".wc-products li:nth-child(7)")
    private WebElementFacade product;

    @FindBy (css=".woocommerce-ordering .orderby")
    private WebElementFacade sortingBar;

    @FindBy (css=".entry-title")
    private WebElementFacade shopPageTitle;

   /* @FindBy (css=".orderby option:last-child")
    private WebElementFacade sortingOption;

    @FindBy (css = ".products")
    private List<WebElementFacade> productsList;*/

    public void selectFirstProductDisplayed(){
        clickOn(firstProductDisplayed);
    }

    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }

    public void selectProduct(){
        clickOn(product);
    }

  /*  public void clckOnSortingBar(){
        clickOn(sortingBar);
    }

    public void clickSortingOption(){
        clickOn(sortingOption);
    } */

    public void verifyShopPageTitle(){
        shopPageTitle.shouldContainText("SHOP");
    }






}
