@CompraExito
Feature: Page application automation
  I, as a user, want to register to me in the site web to add products in the shopping cart

  @RegistroCompraApp
  Scenario: Register website
    Given that user is on register page
    When I enter the name david and lastname quijano
    Then I should see the home page

