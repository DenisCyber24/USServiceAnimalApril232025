Feature: Register Animal Service

  @regServiceWithValidData
  Scenario: Verify Register Animal Service Page with Valid Data
    Given I navigate to homepage of Register Animal Service Page
    When I answer all the quesionare for Regsistering the animal
    And I click on Let us walk you through the process page
    And I enter the details required
    And I click next on We are Ready To Register Your Service Dog!
    And I enter all the details related to animals
    And I select the products for the dogs
    And I click on Add to cart
    And I add the contact details
    And I enter the credit card details
    Then I should confirmation of the order


@invalidEmail
  Scenario: Verify Register Animal Service Page with invalid Email
    Given I navigate to homepage of Register Animal Service Page
    When I answer all the quesionare for Regsistering the animal
    And I click on Let us walk you through the process page
    And I enter the details required with invalid email
    Then I should get an error message for invalid email

  @invalidPhone
  Scenario: Verify Register Animal Service Page with invalid Email
    Given I navigate to homepage of Register Animal Service Page
    When I answer all the quesionare for Regsistering the animal
    And I click on Let us walk you through the process page
    And I enter the details required with invalid phone
    Then I should get an error message for invalid phone





