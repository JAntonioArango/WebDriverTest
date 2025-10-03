# WebDriver Test Automation Framework

![Java](https://img.shields.io/badge/Java-21-blue)
![Selenium](https://img.shields.io/badge/Selenium-4.25.0-brightgreen)
![TestNG](https://img.shields.io/badge/TestNG-6.14.3-orange)
![Maven](https://img.shields.io/badge/Maven-Build%20Tool-red)

## About

This is a Selenium WebDriver test automation framework built for testing the ICESI University website. The project demonstrates automated web testing using the Page Object Model design pattern and includes examples of different testing approaches from basic WebDriver usage to advanced page object implementations.

## Technologies Used

- **Java 21** - Programming language
- **Selenium WebDriver 4.25.0** - Web automation framework
- **TestNG 6.14.3** - Testing framework
- **Maven** - Build and dependency management tool
- **ChromeDriver** - Browser automation

## Project Structure

```
src/
├── main/java/
│   └── com/epam/automation/example/
│       └── Main.java
└── test/java/
    ├── firts_test/
    │   └── WebDriverIcesiFirstTest.java      # Basic WebDriver test
    ├── pageobject_model/
    │   ├── page/
    │   │   ├── AbstractPage.java             # Base page class
    │   │   ├── IcesiHomePage.java           # Home page object
    │   │   └── SearchResultsPagePFMixed.java # Search results page
    │   └── test/
    │       └── WebDriverIcesiTest.java       # Page Object Model test
    └── waits/
        └── CustomConditions.java             # Custom wait conditions
```

## Navigation

The project contains two main testing approaches:

1. **Basic WebDriver Tests** (`firts_test/`) - Direct WebDriver implementation with explicit waits and element interactions
2. **Page Object Model Tests** (`pageobject_model/`) - Structured approach using the Page Object Model design pattern for better maintainability

## Local Deployment

### Prerequisites

- Java 21 or higher
- Maven 3.6+
- Chrome browser installed
- ChromeDriver (automatically managed by Selenium 4.x)

### Setup and Run

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd WebDriverTest
   ```

2. **Install dependencies**
   ```bash
   mvn clean install
   ```

3. **Run all tests**
   ```bash
   mvn test
   ```

4. **Run specific test class**
   ```bash
   mvn test -Dtest=WebDriverIcesiFirstTest
   mvn test -Dtest=WebDriverIcesiTest
   ```

### Test Execution

The tests will:
- Launch Chrome browser automatically
- Navigate to ICESI University website
- Perform search functionality testing
- Validate search results
- Generate test reports

### Configuration

- Tests are configured to run on Chrome browser by default
- Browser window is maximized automatically
- Custom wait conditions are implemented for AJAX operations
- All tests include proper setup and teardown methods