package com.assignmentPersado.pageObjects;


public class AmazonHomePage extends BasePage {

    public String addressPopup = "//span[contains(text(),\"Don't Change\")]/..";

    /**
     * Sometimes a popup about delivery address comes out and intercept to click the Gift Cards Nav.Button
     * use this methode to prevent ElementClickInterceptedException
     */
    public void closeAddressPopupIfItAppears(){
        if (controller().isComponentVisible(this.addressPopup)) {
            controller().press(this.addressPopup);
        }
    }
}
