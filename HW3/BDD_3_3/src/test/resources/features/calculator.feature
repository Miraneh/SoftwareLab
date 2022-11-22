@tag
Feature: Calculator
  Scenario: square root of division of two numbers
    Given Two input values, 36 and 4
    When I take the square root of the division of the first by the second
    Then I expect the result 3

  Scenario Outline: square root of division of two numbers
    Given Two input values, <first> and <second>
    When I take the square root of the division of the first by the second
    Then I expect the result <result>
    Examples:
      | first | second | result |
      | 36     | 4     | 3     |
      | 1.44    | 1      | 1.2      |
      | 144    | 100      | 1.2      |
      | 12    | 0      | -1      |
      | 0    | 0      | -1      |
      | 12    | -1      | -1      |
      | -15    | 1      | -1      |
      | -9    | -1      | 3      |
      | 0    | 1      | 0      |