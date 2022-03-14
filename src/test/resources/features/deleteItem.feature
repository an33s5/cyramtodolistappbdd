Feature: Delete Item


  @deleteitem
  Scenario: Customer deletes an item from to do list
    Given user is on todolist page
    And user enter text into new item field
    And clicks the plus add button
    And finds the added item
    And deletes the item
    Then verify item is delete from the list