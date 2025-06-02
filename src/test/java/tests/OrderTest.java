package tests;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductPage;
import pages.CartPage;

public class OrderTest extends BaseTest {

    public static void main(String[] args) {
        OrderTest test = new OrderTest();
        test.setup();

        LoginPage login = new LoginPage(test.driver);
        login.login("jatin234", "jatin23456");

        ProductPage product = new ProductPage(test.driver);
        product.selectProductAndAddToCart();

        CartPage cart = new CartPage(test.driver);
        cart.placeOrder("Jatin Tiwari", "India", "Udaipur", "+91 9999999999", "June", "2025");

        test.tearDown();
    }
}
