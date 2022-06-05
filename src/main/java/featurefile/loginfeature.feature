Feature: Login OrangeHRM Application
  
  Scenario Outline: Login the OrangeHRM application
    Given I Open the browser
    When I use the application URL
    Then I verify the Title of the Application
    And I enter Username "<username>"
    And I enter Password "<password>"
    And I Click the Submit Button
    Then I validate Page Navigation

    Examples: 
      | username    | password      |
      | chidambaram | some password |
      | admin       | admin         |
      | admin 			| admin123			|
