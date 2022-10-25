Feature: Login
    I want to CHeck login functionality


  Scenario Outline: Login Functionality Invalid
    Given The user in the login page
    When I entered the "<Username>", "<Password>"
    And I pressed log in button
    Then The login page is displayed


    Examples:
      | Username | Password |
      | ahmed    | a123     |
      | blabla   | bb       |

  Scenario: Login Functionality Valid
    Given The user in the login page
    When I entered the login Data
    And I pressed log in button
    Then The Home page is displayed
