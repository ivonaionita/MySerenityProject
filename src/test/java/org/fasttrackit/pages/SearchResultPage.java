package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends PageObject {

    @FindBy (css=".woocommerce-info")
    private  WebElementFacade searchSuccessfullyMessage;

    @FindBy(css=".product")
    private List<WebElementFacade> productList;


    public void searchMessageisDisplayed(){
        searchSuccessfullyMessage.shouldContainText("No products were found matching your selection.");
    }

    public boolean isProductDisplayed(String productName){
        for(WebElementFacade webElementFacade:productList){
            if(webElementFacade.findElement(By.cssSelector(".collection_title h3")).getText().contains(productName))
            return true;
        } return false;
    }
}
