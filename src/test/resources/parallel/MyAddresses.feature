Feature: My addresses page

  Background: 
    Given user has already logged in to application
      | username                     | password       |
      | dec2020secondbatch@gmail.com | Selenium@12345 |

  Scenario: My addresses page title
    Given user is on My addresses page
    When user gets the title of the page
    When user clicks on My addresses link
    Then page title should be "My account - My Store"
    
    Scenario: Add new address
    Given user is on My addresses page
    When user clicks on My addresses link
    When user clicks on Add new address button
    When user enteres Address "OPP"
    When user enteres City "Bettles"
    When user enteres State "Alaska"
    When user enteres Zip/Postal Code "99726" 
    When user enteres Country "United States"
    When user enteres Mobile phone Code "9999999999" 
    When user enteres Please assign an address title for future reference "Test 1"
    When user clicks on save new address button
    Then Verify new address is available or not with a given reference name "Test 1"
    
     
     