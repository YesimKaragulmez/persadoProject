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
        pages.giftCardsPage().clickProduct(2);// There wasn't the third gift card, so I just selected the second one.
        checkData = pages.giftCardsProductPage().controller().getText(pages.giftCardsProductPage().productPrice.trim());

        // Sometimes select design section pops up so this step closes the window if it pops up
        if (pages.giftCardsProductPage().controller().isComponentVisible(pages.giftCardsProductPage().selectDesignCloseButton)){
            pages.giftCardsProductPage().clickSelectDesignCloseButton();
        }
        pages.giftCardsProductPage().clickAddToCart();
        pages.cartPage().clickNavCartIcon();
        Assert.assertEquals(checkData, pages.cartPage().controller().getText(pages.cartPage().subTotal).trim());

    }

}
