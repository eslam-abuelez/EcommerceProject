@smoke
Feature: NOP-04 Search for product

  Scenario Outline: user could search using product name
    When user clicks on search field
    And user search by "<productName>"
    Then user will find "<productName>" relative results
    Examples:
      | productName |
      | book        |
      | laptop      |
      | nike        |

  Scenario Outline: user could search using sku
    When user clicks on search field
    And user search by "<sku>"
    Then user will find "<sku>" specific results
    Examples:
      | sku       |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |
