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

    @FindBy (css=".entry-title")
    private WebElementFacade shopPageTitle;

    @FindBy (css = ".products")
    private List<WebElementFacade> productsList;

    @FindBy(css=".wc-products li .onsale")
    private List<WebElementFacade> productsWithSaleTag;

    public void selectFirstProductDisplayed(){
        clickOn(firstProductDisplayed);
    }

    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }

    public void selectProduct(){
        clickOn(product);
    }

    public void verifyShopPageTitle(){
        shopPageTitle.shouldContainText("SHOP");
    }

    public boolean verifyProductsWithSaleTag(){
        for(WebElementFacade webElementFacade:productsWithSaleTag){
            if(webElementFacade.containsElements(By.cssSelector(".price-cart del")))
                return true;
        }return false;
    }






}
