package com.assignmentPersado.pageObjects;

public class GiftCardsPage extends BasePage {
    /**
     * Finds the check point's locator based on label text
     * @param header group of check points' header name
     * @param option name of check point
     * @return Locator
     */
    public String leftColumnCheckPoint(String header, String option) {
        return "xpath=//span[contains(text(),'" + header + "')]/../following-sibling::ul/li//*[contains(text(),'" + option + "')]/preceding-sibling::div";
    }


    /**
     * Finds the product based on its index
     * @param indexOfProduct index of product
     * @return Locator
     */
    public String product(int indexOfProduct) {
        return "xpath=(//span[@data-component-type='s-product-image']//img)[" + indexOfProduct + "]";
    }


    public void clickLeftColumnCheckPoint(String header, String option) {
        controller().click(this.leftColumnCheckPoint(header, option));
    }
    public void clickProduct(int indexOfProduct) {
        controller().click(this.product(indexOfProduct));
    }


}
