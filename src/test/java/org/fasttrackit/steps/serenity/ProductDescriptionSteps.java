package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductDescriptionPage;
import org.fasttrackit.pages.ProductsPage;

public class ProductDescriptionSteps {
    private HomePage  homePage;
    private ProductsPage productsPage;
    private ProductDescriptionPage productDescriptionPage;
    private CartPage cartPage;

    @Step
    public void selectProductColor(){

        homePage.open();
        homePage.clickProductCategory();
        productsPage.selectProduct();
        productDescriptionPage.selectProductColor();

    }

    @Step
    public  void selectProductSize(){
        homePage.open();
        homePage.clickProductCategory();
        productsPage.selectProduct();
        productDescriptionPage.selectproductSize();

    }
    @Step
    public void selectProductOptions(){
        homePage.open();
        homePage.clickProductCategory();
        productsPage.selectProduct();
        productDescriptionPage.selectProductColor();
        productDescriptionPage.selectproductSize();
    }
    @Step
    public void addToCartProduct(){
        homePage.open();
        homePage.clickProductCategory();
        productsPage.selectProduct();
        productDescriptionPage.selectproductSize();
        productDescriptionPage.selectProductColor();
        productDescriptionPage.clickAddToCartButton();
    }

    @Step
    public void verifyProductAddedToCart(){
        cartPage.verifySuccessMsg();

    }
}
