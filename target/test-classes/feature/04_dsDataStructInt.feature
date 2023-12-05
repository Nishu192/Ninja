Feature: To Automate the page of DataStructure

  @HomePage
  Scenario: Home Page
    Given The user is on the DS Algo Home Page
    When The user clicks  Get Started button below the Data structures-Introduction
    Then The user should land in "Data Structures-Introduction" DS page

  @DSPage
  Scenario: Data Structure Home page
    Given The user is on the Data Structure Introduction Page
    When The user clicks Time Complexity link
    Then The user should be redirected to "Time Complexity" TC page

  @ComplexityPage
  Scenario: Time Complexity Page
    Given The user is on the Time Complexity Page
    When The user clicks Try Here  button of Time Complexity page
    Then The user should be redirected to a page having an Python Editor

  @PythonEditor_Blank
  Scenario: Python Editor page without data
    Given The user is on tryEditor page
    When The user clicks the run button without entring the code in the Editor
    Then Nothing happens to the page and no error message is displayed

  @PythonEditor_Invalid
  Scenario Outline: Python Editor page with Invalid data
    Given User is on the tryEditor page
    And enters the data in the Editor after reading data from excel sheet "<sheetname>" with column_name "<colname>" and row_number <rownum>
    When The User clicks a run button
    Then The user see error msg in alert window and press ok button

    Examples: 
      | sheetname   | colname             | rownum |
      | Python_code | Python_Invalid_Data |      2 |

  @PythonEditor_Valid
  Scenario Outline: Python Editor page with valid data
    Given The user is on the tryEditor page
    And enters data in the Editor after reading data from excel sheet "<sheetname>" with column_name "<colname>" and row_number <rownum>
    When User clicks a run button
    Then output should be displayed on the console

    Examples: 
      | sheetname   | colname           | rownum |
      | Python_code | Python_Valid_Data |      2 |

  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  @PracticeQuestions
  Scenario: Time Complexity Page
    Given The user is on the Time Complexity Page
    When The user clicks Practice Questions link of DS
    Then The user does not find any practice problems and the page is null
