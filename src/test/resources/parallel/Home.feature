Feature: My Home page

  Background: 
    Given user has already logged in to application
      | username                     | password       |
      | dec2020secondbatch@gmail.com | Selenium@12345 |

  Scenario: Search and add product to cart
  When user navigates in Home page
  When user searches product "Faded Short Sleeve T-shirts"
  When Add product to cart
  Then Verify added product