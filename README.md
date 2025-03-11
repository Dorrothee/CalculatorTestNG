# ***Unit Testing Frameworks. TestNG Framework***

## Project Overview
This project contains unit tests for the `Calculator-1.0.jar` library using TestNG.

## Prerequisites
- Java Development Kit (JDK) installed
- TestNG framework set up in your project
- `Calculator-1.0.jar` added to the project references

## Test Structure
- Each unit test class corresponds to a single method of the calculator library.
- Tests include both pre-conditions and post-conditions using appropriate TestNG annotations.
- Parameterized tests are used to demonstrate a data-driven approach.
- Test execution is configured to run in parallel mode.
- An XML configuration file is provided for managing test execution and grouping tests.

## Setup Instructions
1. **Add Dependencies**: Ensure that `Calculator-1.0.jar` is included in your project references.
2. **Install TestNG**: If not already installed, add TestNG to your project.
3. **Check XML Configuration**: Verify that the `testng.xml` file is correctly set up for test grouping and execution.
4. **Run Tests**: Execute tests using your IDE or the command line.
    - Right-click the `testng.xml` file and select `Run`.

## Acceptance Criteria
- A separate unit test class exists for each method in `Calculator-1.0.jar`.
- Tests include proper pre-conditions and post-conditions.
- Screenshots of test execution results are available.
- The `testng.xml` file allows test grouping and selective execution.
- Data-driven tests are implemented using TestNG features.
- Parallel test execution is configured and demonstrated.