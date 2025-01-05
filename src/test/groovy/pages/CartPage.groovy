package pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class CartPage extends BasePage {
    @FindBy(id = "checkout")
    private WebElement checkoutButton

    CartPage(WebDriver driver) {
        super(driver)
    }

    void proceedToCheckout() {
        checkoutButton.click()
    }
}