# Selenium WebDriver Automation

A Java-based Selenium WebDriver automation project demonstrating UI test automation using the Page Object Model, reusable test utilities, and environment-based configuration.

## Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)

## Project Structure

```text
src/
├── main/
│   └── java/
│       ├── base/       # Base page functionality
│       ├── pages/      # Page Object classes
│       └── utils/      # Driver and configuration utilities
│
└── test/
    └── java/
        ├── base/       # Test setup and teardown
        └── tests/      # Test cases
```

Configuration
The project supports environment-based configuration using properties files.
Example:
config-qa.properties
baseURL=https://qaplayground.com/practice
browser=chrome
Running Tests
Run the test suite with:
mvn clean test -Denv=qa
Test Automation Approach
The project follows the Page Object Model to separate:
Test logic and assertions
Page-specific locators and actions
Common Selenium functionality
WebDriver and environment configuration
This structure keeps the test suite maintainable, reusable, and easy to extend as additional scenarios are added.

