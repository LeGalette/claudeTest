package tests

import org.testng.annotations.Test
import pages.*

class SauceDemoTest extends BaseTest {
    @Test
    void testSauceDemoCheckout() {
        // Initialize pages
        def loginPage = new LoginPage(driver)
        def productsPage = new ProductsPage(driver)
        def cartPage = new CartPage(driver)
        def checkoutPage = new CheckoutPage(driver)

        // Test steps
        loginPage.navigateTo()
        loginPage.login("standard_user", "secret_sauce")
        
        productsPage.addBackpackToCart()
        productsPage.openCart()
        
        cartPage.proceedToCheckout()
        
        // Verify we're on the checkout page
        assert driver.currentUrl.contains("checkout-step-one")
    }
}