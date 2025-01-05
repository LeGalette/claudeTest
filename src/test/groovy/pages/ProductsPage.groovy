package pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class ProductsPage extends BasePage {
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addBackpackButton

    @FindBy(className = "shopping_cart_link")
    private WebElement cartLink

    ProductsPage(WebDriver driver) {
        super(driver)
    }

    void addBackpackToCart() {
        addBackpackButton.click()
    }

    void openCart() {
        cartLink.click()
    }
}