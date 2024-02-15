#Author: nagamani@your.domain.com
@tag
Feature: Login Functionality of Tricentis

  @tag1
  Scenario Outline: To Test the Login Functionality of Tricentis
    Given I am on the after login home page
    When I click on the login link
    And I will enter the "user988964@gmail.com" in Email tab
    And I will enter the "User@12345" in Password tab
    And I will click on the Login button
    Then It should get login and show "success"
    
    