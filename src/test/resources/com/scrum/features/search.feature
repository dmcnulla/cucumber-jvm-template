@done @login
Feature: Login functionality

  @search @done
  Scenario: As web user I want search for something
    Given I am a web user
    And I go to Google
    When I search for "cucumber-jvm"
    Then I should find "cucumber-jvm"