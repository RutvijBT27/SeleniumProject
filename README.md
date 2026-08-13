# Selenium WebDriver Automation

A Java-based Selenium WebDriver automation project demonstrating maintainable UI test automation using the Page Object Model, reusable utilities, and environment-based configuration.

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

## Configuration

The project supports environment-based configuration using properties files.

For example, the QA environment uses `config-qa.properties`:

- `baseURL` — application URL used for testing
- `browser` — browser used for test execution

## Running Tests

Run the test suite with:

```bash
mvn clean test -Denv=qa

## Test Automation Approach

The project follows the Page Object Model (POM) to maintain a clear separation between:

- **Test logic and assertions**
- **Page-specific locators and actions**
- **Common Selenium functionality**
- **WebDriver and environment configuration**

This structure keeps the test suite maintainable, reusable, and easy to extend as additional scenarios are added.

