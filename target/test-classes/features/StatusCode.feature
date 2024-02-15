#Author: nagamani@your.domain.com
Feature: Get One user
  I want to get user details

  Scenario: Get user Details
    Given a user should be on ApiPage
    When a user retrieved
    Then validate the outcomes status code is 200
    And check outcomes response with following