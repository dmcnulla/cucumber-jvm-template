@google
Feature: As a web user I want to search for keywords on the internet In order to access more information.

@search
   Scenario: As web user I want search for something
      Given I am a web user
      And I go to Google
      When I search for "cucumber-jvm"
      Then I should find "cucumber-jvm"

@search
@outline
   Scenario Outline: As web user I want search for things
      Given I am a web user
      And I go to Google
      When I search for "<Topic>"
      Then I should find "<LinkText>"
      Examples:
         | Topic        | LinkText     |
         | cucumber-jvm | cucumber-jvm |
         | pick axe     | ruby         |

