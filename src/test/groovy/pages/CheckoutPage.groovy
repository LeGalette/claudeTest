package pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class CheckoutPage extends BasePage {
    @FindBy(id = "first-name")
    private WebElement firstNameInput

    @FindBy(id = "last-name")
    private WebElement lastNameInput

    @FindBy(id = "postal-code")
    private WebElement postalCodeInput

    @FindBy(id = "continue")
    private WebElement continueButton

    CheckoutPage(WebDriver driver) {
        super(driver)
    }

    void fillCheckoutInfo(String firstName, String lastName, String postalCode) {
        firstNameInput.sendKeys(firstName)
        lastNameInput.sendKeys(lastName)
        postalCodeInput.sendKeys(postalCode)
        continueButton.click()
    }
}