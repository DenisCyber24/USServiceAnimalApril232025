Feature: Register Animal Service

  @esaletterwithvaliddata
  Scenario: Verify get ESA Letter page with Valid Data
    Given I navigate to homepage of get ESA Letter page
    When I answer all the quesionare for ESA letter
    And I enter the details required for ESA letter
    And I enter all the details related to animals for ESA letter
    And I answer all the questions related to ESA letter for housing
    And I answer all quesionare for Emotional Evaluation
    And I select the products ESA for the dogs
    And I add the contact details
    And I enter the credit card details
    Then I should confirmation of the order
