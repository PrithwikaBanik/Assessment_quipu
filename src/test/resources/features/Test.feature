@Test
Feature: Quipu QA Task

  @Login
  Scenario Outline: As a user I want to check the functionality for the Login page
    Given Navigate to Login page with <URL>
    And on the HomePage snooze for 2 seconds
    Then on the Login page <Email> is set for the Email value
    And on the Login page <Password> is set for the Password value
    And on the Login page Sign in button is clicked
    And on the Dashboard snooze for 2 seconds
    And on the Dashboard page Welcome message is displayed
    And on the Dashboard page Welcome message should be <ExpectedMessage>

  Examples:
    |URL| Email| Password|ExpectedMessage|
    |  http://www.automationpractice.pl/index.php?controller=authentication&back=my-account | test_demo@byom.de| Test1234|Welcome to your account. Here you can manage all of your personal information and orders.|


  @Search
  Scenario Outline: As a user I want to check the functionality for the Login,Search page
    Given Navigate to Home page with <URL>
    When on the Search page <ItemToSearch> is set for the search field value
    And on the Search page SearchButton is clicked
    Then on the Search page SearchHeader title should be "Search  "Printed Summer Dress""

    Examples:
      |URL| ItemToSearch|
      |  http://www.automationpractice.pl/index.php |  Printed Summer Dress|


  @AddToCart
  Scenario Outline: As a user I want to check the functionality for the Add to cart
    Given Navigate to Browse page with <URL>
    When on the Browse page AddToCartButton is clicked
    Then on the Browse page SuccessfullMessage is displayed

    Examples:
      |URL|
      |  http://www.automationpractice.pl/index.php?id_product=5&controller=product&search_query=Printed+Summer+Dress&results=3#/16-color-yellow/2-size-m |