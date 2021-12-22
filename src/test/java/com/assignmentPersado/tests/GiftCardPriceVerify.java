package com.assignmentPersado.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftCardPriceVerify extends BaseTest {

    @Test
    public void verifyGiftCardPriceInTheCart(){

        pages.amazonHomePage().closeAddressPopupIfItAppears();
        pages.amazonHomePage().clickNavBar("Gift Card");
        pages.giftCardsPage().clickLeftColumnCheckPoint("Delivery Type","Print at Home");
        pages.giftCardsPage().clickLeftColumnCheckPoint("Format","Standard Designs");
        pages.giftCardsPage().clickProduct(2);// There was no the third gift card, so I just select the second one.
        checkData = pages.giftCardsProductPage().controller().getText(pages.giftCardsProductPage().productPrice.trim());
        pages.giftCardsProductPage().clickAddToCart();
        pages.cartPage().clickNavCartIcon();
        Assert.assertEquals(checkData, pages.cartPage().controller().getText(pages.cartPage().subTotal).trim());

    }

}
