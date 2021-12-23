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
     * @param name module's name on the nov bar
     * @return locator's xpath
     */
    public String navBar(String name) {
        return "xpath=//div[@id='nav-xshop']//a[contains(text(),'" + name + "')]";
    }


    /**
     * click every module on the nav bar based on name
     * @param name module name
     */
    public void clickNavBar(String name) {
        controller().press(this.navBar(name));
    }

    public void clickNavCartIcon() {
        controller().click(this.navCartIcon);
    }


}
