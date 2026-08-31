Feature: Test Orange HRM Login Functionality
Background:
  Given  I am on the Orange HRM login page
  When   I enter valid "Admin" and "admin123"
  And    I click on the login button

  @Smoke
  Scenario: Successful login with valid credentials
    Then   I should be redirected to the dashboard page

  @Regression
  Scenario: Successfull login
    Then   I should be redirected to the dashboard page
    Then   I navigate to Myinfo page


  @Sanity
  Scenario: Successful navigation to PIM page
    Then   I should be redirected to the dashboard page
    Then   I navigate to PIM module
    And    I verify client brand banner is visible
    And    I verify PIM is displayed on header section







