Feature: Login Page

@regrasion
  Scenario: Successful Login with valid Credectials
    Given User Lunch chrome browser
    #   When  User Select login Link
     # When User open URL "https://demo.nopcommerce.com/login"
    When User open loginurl
    And User Select login Link
    And User Enter Valid user name "dilip132@gmail.com" and password "1234567"
    And Click o Login button
    Then Open Dashboard "Welcome to our store"
    When User Select logOut Link
    Then Page Title should be logout
    And Close the Browser
