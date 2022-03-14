Feature: Add New Item

  Scenario: Customer adds an item to the list
    Given user is on todolist page
    And user enter text into new item field
    And clicks the plus add button
    Then verify item has been added to the list