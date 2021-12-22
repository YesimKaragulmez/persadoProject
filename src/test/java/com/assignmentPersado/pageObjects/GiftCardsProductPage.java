package com.assignmentPersado.pageObjects;

public class GiftCardsProductPage extends BasePage{

    public String productPrice = "//span[@class='a-color-price a-text-bold']";
    public String addToCartButton = "//input[@id='gc-buy-box-atc']";

    public void clickAddToCart() {
        controller().waitForElement(this.addToCartButton);
        controller().click(this.addToCartButton);

    }
}
