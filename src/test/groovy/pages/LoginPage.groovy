package pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class LoginPage extends BasePage {
    @FindBy(id = "user-name")
    private WebElement usernameInput

    @FindBy(id = "password")
    private WebElement passwordInput

    @FindBy(id = "login-button")
    private WebElement loginButton

    LoginPage(WebDriver driver) {
        super(driver)
    }

    void login(String username, String password) {
        usernameInput.sendKeys(username)
        passwordInput.sendKeys(password)
        loginButton.click()
    }

    void navigateTo() {
        driver.get("https://www.saucedemo.com/")
    }
}