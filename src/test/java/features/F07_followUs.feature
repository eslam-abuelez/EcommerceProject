@smoke
Feature: NOP-07 Follow us

  Scenario: user opens facebook page
    When user click on facebook link
    Then "https://www.facebook.com/nopCommerce" facebook link is opened on a new tab

  Scenario: user opens twitter page
    When user click on twitter link
    Then "https://twitter.com/nopCommerce" twitter link is opened on a new tab

  Scenario: user opens RSS page
    When user click on RSS link
    Then "https://demo.nopcommerce.com/new-online-store-is-open" rss link is opened on a new tab

  Scenario: user opens youTube page
    When user click on youTube link
    Then "https://www.youtube.com/user/nopCommerce" youtube link is opened on a new tab
