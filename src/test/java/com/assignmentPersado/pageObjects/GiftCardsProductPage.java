package com.assignmentPersado.pageObjects;

public class GiftCardsProductPage extends BasePage{

    public String productPrice = "//span[@class='a-color-price a-text-bold']";
    public String addToCartButton = "//input[@id='gc-buy-box-atc']";
    public String selectDesignCloseButton = "//button[@data-action=\"a-popover-close\"]";

    public void clickAddToCart() {
        controller().click(this.addToCartButton);
    }

    public void clickSelectDesignCloseButton() {
        controller().click(this.selectDesignCloseButton);
    }
}
