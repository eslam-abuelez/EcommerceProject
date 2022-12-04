@smoke
Feature: NOP-03 Change Currency

  Scenario: User could change the currency
    When user select Euro currency from currency dropdown list
    Then euro symbol is shown in the displayed products