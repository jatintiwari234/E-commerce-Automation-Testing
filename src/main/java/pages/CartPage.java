package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By cartLink = By.id("cartur");
    By placeOrderBtn = By.xpath("//button[text()='Place Order']");
    By name = By.id("name");
    By country = By.id("country");
    By city = By.id("city");
    By card = By.id("card");
    By month = By.id("month");
    By year = By.id("year");
    By purchaseBtn = By.xpath("//button[text()='Purchase']");
    By confirmationMsg = By.cssSelector(".sweet-alert h2");

    public void placeOrder(String nm, String ctry, String cty, String cd, String mnth, String yr) {
        driver.findElement(cartLink).click();
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        driver.findElement(placeOrderBtn).click();
        driver.findElement(name).sendKeys(nm);
        driver.findElement(country).sendKeys(ctry);
        driver.findElement(city).sendKeys(cty);
        driver.findElement(card).sendKeys(cd);
        driver.findElement(month).sendKeys(mnth);
        driver.findElement(year).sendKeys(yr);
        driver.findElement(purchaseBtn).click();
        String confirmation = driver.findElement(confirmationMsg).getText();
        System.out.println("Order Confirmation: " + confirmation);
    }
}
