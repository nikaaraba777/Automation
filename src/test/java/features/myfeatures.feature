@test
Feature: kkk
@test1
  Scenario: algo
    Given I navigate to web page
    When I click on search


  @test2
  Scenario: algo2
    Given I navigate to web page "https://the-internet.herokuapp.com/add_remove_elements/"
#    Then I wait 5000 seconds
    When I click element 10 times
#    Then I wait 20 seconds
    When I remove added elements
#    Then I wait 5000 seconds
  
  @test3
  Scenario: algo3
    Given I navigate to web page "https://the-internet.herokuapp.com/challenging_dom"
#    Then I wait 5000 seconds
    When I click on element called baz
    When I inpect canvas
    When I navigate to "https://the-internet.herokuapp.com/hovers"
    When I click on the element
    When I go back



    @test4
    Scenario: Checkboxes
      Given I navigate to "https://the-internet.herokuapp.com/checkboxes"
      When I click on checkbox1




