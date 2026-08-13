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

## Configuration

The project supports environment-based configuration using properties files.

For example, the QA environment uses `config-qa.properties`:

- `baseURL` — application URL used for testing
- `browser` — browser used for test execution

## Running Tests

Run the test suite with:

```bash
mvn clean test -Denv=qa

