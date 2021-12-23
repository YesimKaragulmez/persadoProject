package com.assignmentPersado.utilities;

import com.assignmentPersado.pageObjects.AmazonHomePage;
import com.assignmentPersado.pageObjects.CartPage;
import com.assignmentPersado.pageObjects.GiftCardsPage;
import com.assignmentPersado.pageObjects.GiftCardsProductPage;
import org.springframework.stereotype.Component;

@Component
public class Pages {

    private AmazonHomePage amazonHomePage;
    private GiftCardsPage giftCardsPage;
    private GiftCardsProductPage giftCardsProductPage;
    private CartPage cartPage;

    public Pages() {
        this.amazonHomePage = new AmazonHomePage();
        this.giftCardsPage = new GiftCardsPage();
        this.giftCardsProductPage = new GiftCardsProductPage();
        this.cartPage = new CartPage();
    }

    public AmazonHomePage amazonHomePage() {
        return amazonHomePage;
    }
    public GiftCardsPage giftCardsPage() {return giftCardsPage; }
    public GiftCardsProductPage giftCardsProductPage() {
        return giftCardsProductPage;
    }
    public CartPage cartPage() {
        return cartPage;
    }
}
