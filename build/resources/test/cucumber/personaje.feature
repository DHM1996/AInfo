Feature: character health

  Scenario: attack a character with common attack
    Given a character
    When I attack a character with common attack
    Then the health of the character must be 70

  Scenario: attack a character with special attack
    Given a character
    When I attack character with a power of 50
    Then the health of the character must be 50


  Scenario: character dead
    Given a character
    When I attack a character with a common attack four times
    Then the character must be dead

  Scenario: transformation
    Given a character
    When the character transforms for the first time
    Then the character transformation must be "mode 2"

  Scenario: transformation
    Given a character
    When the character transforms for the second time
    Then the character transformation must be "mode 3"