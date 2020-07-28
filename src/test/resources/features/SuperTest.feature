@SmokeTest
  Feature: My Awesome feature

    Scenario: My First Scenario
      Given I open web https://www.ss.lv/
      When I open dogs tab
      Then I change dog age min to 1
      And I change dog age max to 2

