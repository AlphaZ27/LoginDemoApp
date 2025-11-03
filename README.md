# Login Demo App
A simple Android app built with Jetpack Compose and MVVM architecture that demonstrates login form validation, state management, and UI testing with Espresso.
Includes a GitHub Actions CI pipeline for automated build and test execution.

## Features
- Jetpack Compose UI
- MVVM Architecture
- Real-time input validation
- Mock login logic (test@example.com / 1234)
- Espresso UI tests
- GitHub Actions CI integration

## Project Structure
- ui/LoginScreen
- viewmodel/LoginViewModel
- MainActivity

## Testing
### Espresso + Compose UI Testing
Test File:
app/src/androidTest/java/com/example/logindemo/LoginScreenTest.kt
Tests include:
- Empty field validation
- Successful login using mock credentials

## Continuous Integration
GitHub Actions workflow (.github/workflows/android-ci.yml):
- Automatically builds the app
- Runs unit & UI tests on each push and PR
- Uses JDK 17 and Gradle caching for faster builds

To enable:
1. Push the repo to GitHub
2. The workflow runs automatically on commits to main

## Usage
#### Credentials:
Email: test@example.com

Password: 1234
Steps:
1. Enter credentials.
2. Click “Login”.
3. A success message appears if credentials are correct.
