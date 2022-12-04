@smoke
Feature: F08_Wishlist Add product to Wishlist

  Scenario: user could add a product to the wishlist
    When user add product to wishlist from home page
    Then  Success message is displayed

  Scenario: products are displayed in the wishlist page
    When user add product to wishlist from home page
    And user open wishlist page
    Then product is displayed on wishlist