Feature: Sign up flow

  Scenario: Create account successfully
    Given I am on the signup page
    When I enter valid details and click "Create an Account" button
    Then the account should be created successfully

  Scenario: Error message for missing fields
    Given I am on the signup page
    When I leave all mandatory fields empty and click "Create an Account" button
    Then error messages should be displayed for mandatory fields

  Scenario: Error message for invalid email format
    Given I am on the signup page
    When I enter an invalid email and click "Create an Account" button
    Then an error message should be displayed for invalid email format

  Scenario: Error message for mismatched passwords
    Given I am on the signup page
    When I enter mismatched passwords and click "Create an Account" button
    Then an error message should be displayed for mismatched passwords
