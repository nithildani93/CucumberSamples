Feature: Working with WpPlugin

  Scenario: Login Functionality of WpPlugin
    Given the user opens the login page
    When the user enters the username as "user"
    And clicks submit button
    Then the user should be logged into the site

  Scenario: About Wordpress Functionality
    When the user clicks the wp-logo
    Then the user should be displayed about latest release
    When the user hover the mouse on the wordpress logo
    And clicks on About Wordpress menu
    Then the user should be displayed about latest release
