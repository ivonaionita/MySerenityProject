package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.ShopSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class ShopTest extends BaseTest {
   @Steps
    private LoginSteps loginSteps;
   @Steps
   private ShopSteps shopSteps;
   @Steps
   private CartSteps cartSteps;


    @Test
    public void openProductDescription() {
        shopSteps.navigateToShopPage();
        shopSteps.openFirstProductDisplayed();
        shopSteps.isProductDescribed();

        // shopSteps.navigateToFirstProductPage();}
    }

    @Test
    public void addToCartFirstProductDisplayed(){
        shopSteps.navigateToShopPage();
        shopSteps.addToCartFirstProduct();
        shopSteps.selectViewCartButton();
        cartSteps.isProductInCart("Album");
    }

    @Test
    public void checkSalesProducts(){
        shopSteps.navigateToShopPage();
        shopSteps.checkSaleProducts();
    }
}
