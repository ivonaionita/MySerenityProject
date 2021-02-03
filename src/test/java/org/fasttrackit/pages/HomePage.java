package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

   @FindBy(css = ".skip-account .label")
    private WebElementFacade accountButton;

    @FindBy(css = "a[title*='Log']")
    private WebElementFacade loginLink;

    @FindBy(css =".nav-primary li:nth-child(6) .level0" )
    private WebElementFacade productCategoryButton;

    public void clickAccountButton(){
        clickOn(accountButton);
    }

    public void clickLoginLink(){
        clickOn(loginLink);
    }

    public void clickProductCategory(){
        clickOn(productCategoryButton);
    }


}
