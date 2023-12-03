@dsIntro
Feature: To Automate Introduction page of DS_Algo

  @Browser_page
  Scenario Outline: Browser page
    Given The user should be open the browser
    When The user enter the DS_Algo Portal <URL>
    Then The user should landed on the DS_Algo Get Started page with message "You are at the right place"

    Examples: 
      | URL                                |
      | https://dsportalapp.herokuapp.com/ |

  @Start_page
  Scenario: DS Algo Get Started page
    Given The user should open the DS Algo Portal URL in any supported browser
    When The user clicks the Get Started button
    Then The user should land in Data Structure Introduction Page with "Register" and "Sign in" links

  @Intro_page
  Scenario: DS Introduction page
    Given The user is on the DS Introduction page
    When The user clicks the data structure dropdown  arrow
    Then The user should able to see 6 options Arrays "Linked,List,Stack,Queue,Tree,Graph" in dropdown menu

  Scenario: DS Introduction page
    Given The user is on the DS Introduction page
    When The user selects any data structures item from the drop down without Sign in.
    Then The user should able to see an warning message "You are not logged in"

  Scenario: DS Introduction page
    Given The user is on the DS Introduction page
    When The user clicks any "Get Started" buttons of data structures  on the DS Introduction page
    Then The user should able to see an warning message "You are not logged in"
