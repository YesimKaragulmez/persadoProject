package com.assignmentPersado.pageObjects;

import com.persado.oss.quality.stevia.selenium.core.WebComponent;
import org.springframework.stereotype.Component;

/**
 * BasePage class is extended by all page classes and contains all methods, and locators
 * that is shared across all page objects
 */
@Component
public class BasePage extends WebComponent {


    public String navCartIcon = "//a[@id='nav-cart']";

    /**
     * Find locators based on its text
     * @param s module's name on the nov bar
     * @return locator's xpath
     */
    public String navBar(String s) {
        return "xpath=//div[@id='nav-xshop']//a[contains(text(),'" + s + "')]";
    }


    /**
     * click every module on the nav bar based on text
     * @param s module name
     */
    public void clickNavBar(String s) {
        controller().press(this.navBar(s));
    }

    public void clickNavCartIcon() {
        controller().click(this.navCartIcon);
    }


}
