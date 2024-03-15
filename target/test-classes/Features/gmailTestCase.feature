Feature: Compose email

  Scenario: Compose email
    Given I want to send an email 
    And Click compose email 
    When Add receipent
    And Add Subject
    Then Add text in content area
    And Click send button

  