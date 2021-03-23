package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.pages.ShopPage;

public class ShopSteps {

    private HomePage homePage;
    private ShopPage shopPage;
    private CartPage cartPage;
    private ProductPage productPage;

    @Step
    public void openShopPage() {
        homePage.clickShopButton();
    }

    @Step
    public void navigateToShopPage(){
        homePage.open();
        homePage.clickShopButton();
    }

    @Step
    public void openFirstProductDisplayed(){
        shopPage.selectFirstProductDisplayed();
    }

    @Step
    public void navigateToFirstProductPage(){
        navigateToShopPage();
        openFirstProductDisplayed();
    }

    @Step
    public void addToCartFirstProduct(){
        shopPage.clickAddToCartButton();
    }

    @Step
    public void selectViewCartButton(){
        homePage.clickCartButton();
    }


    @Step
    public void isProductDescribed(){
        productPage.isDescriptionDisplayed();

    }

    @Step
    public void addProductToCart(){
        productPage.clickAddToCart();
    }

    @Step
    public void openProductPage(){
        shopPage.selectProduct();
    }

    @Step
    public void addProductToShoppingCart(){
        openShopPage();
        openProductPage();
        addProductToCart();
    }

    @Step
    public void clickMyAccount(){
        homePage.clickMyAccountButton();
    }

    @Step
    public void isShopPageTitleDisplayed(){
        shopPage.verifyShopPageTitle();
    }

    @Step
    public void checkSaleProducts(){
        shopPage.verifyProductsWithSaleTag();
    }




}
