# SauceDemo Test Automation Framework

This is a test automation framework for SauceDemo using Groovy and implementing the Page Object Model pattern.

## Project Structure

```
src/test/groovy/
├── pages/
│   ├── BasePage.groovy
│   ├── LoginPage.groovy
│   ├── ProductsPage.groovy
│   ├── CartPage.groovy
│   └── CheckoutPage.groovy
└── tests/
    ├── BaseTest.groovy
    └── SauceDemoTest.groovy
```

## Prerequisites

- Java JDK 8 or higher
- Gradle
- Chrome browser
- ChromeDriver (matching your Chrome version)

## Running Tests

To run the tests, execute:

```bash
gradle test
```

## Framework Features

- Page Object Model implementation
- TestNG for test execution
- Selenium WebDriver for browser automation
- Groovy for test scripting
- Gradle for build management