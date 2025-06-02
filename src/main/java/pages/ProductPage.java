package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstProduct = By.cssSelector(".card-title a");
    By addToCartBtn = By.linkText("Add to cart");

    public void selectProductAndAddToCart() {
        try {
            Thread.sleep(3000);

            WebElement productLink = driver.findElement(firstProduct);
            productLink.click();

            Thread.sleep(3000); // wait for product page to load

            driver.findElement(addToCartBtn).click();

            Thread.sleep(2000); // wait for alert to appear
            driver.switchTo().alert().accept();

        } catch (Exception e) {
            System.out.println("Error in adding product: " + e.getMessage());
        }
    }
}
