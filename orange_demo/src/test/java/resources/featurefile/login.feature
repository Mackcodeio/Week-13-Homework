Feature: Login feature
  As a User want to check login functionality

  Scenario: User should login sucessfully with valid credentials
    Given User is on Home page
    When I enter username "Admin"
    And I enter password "admin123"
    And I Click on login button
    Then I should login successfully and see "Dashboard"


