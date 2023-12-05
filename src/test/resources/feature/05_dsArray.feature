Feature: To Automate the page of Array

  @Array_page
  Scenario: Home Page
    Given The user is on the DS Algo Home Page
    When The user clicks  "Get Started" button below the array
    Then The user should be redirected to "Array" page

  @ArraysInPythonPage
  Scenario: Array Page
    Given The  user is on the Array  page
    When The user clicks a Arrays in Python link
    Then The user should be redirected to "Arrays in Python" AP Page

  @PythonEditor
  Scenario: Array Page
    Given The  user is on the Array  page
    When The user clicks Try Here button of Array in Python Page
    Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"

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

  @ArraysUsingList_page
  Scenario: Array in Python Page
    Given The user is on the Array in Python Page
    When The user clicks a Arrays Using List link
    Then The user should be redirected to "Arrays Using List" AL page.

  @PythonEditor
  Scenario: Array Using List Page
    Given The  user is on the Array  Using List page
    When The user clicks Try Here button of Array Using List Page
    Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"

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

  @ArraysBasicOperation_page
  Scenario: Array Using List Page
    Given The  user is on the Array  Using List page
    When The user clicks a Basic Operations in Lists  link
    Then The user should be redirected to "Basic Operations in Lists" BO page.

  @ArraysBasicOperation_Tryhere
  Scenario: Basic operations in Lists page
    Given The  user is on the  Basic Operations in Lists   page
    When The user clicks Try Here button of Operations in Lists Page
    Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"

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

  @AppOfArray
  Scenario: Basic operations in Lists page
    Given The  user is on the  Basic Operations in Lists   page
    When The user clicks an Applications of Array link
    Then The user should be redirected to "Applications of Array" AA page.

  @AppOfArray_4Links
  Scenario: Application of Array page
    Given The  user is on the  Applications of Array page
    When The user clicks Practice Questions link
    Then The user should be redirected to practice page having links like "Search the array","Max Consecutive Ones","Find Numbers with Even Number of Digits" ,"Squares of a Sorted Array"

  @PythonEditor
  Scenario: Practice Questions page
    Given The user is on Practice page
    When The user clicks search the array  link
    Then The user should be redirected to "QUESTION" page contains a question,an tryEditor with Run and Submit buttons

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

  @PythonEditor
  Scenario: Practice Questions page
    Given The user is on Practice page
    When The user clicks Max consecutive ones link
    Then The user should be redirected to "QUESTION" page contains a question,an tryEditor with Run and Submit buttons

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

  @PythonEditor
  Scenario: Practice Questions page
    Given The user is on Practice page
    When The user clicks Find numbers with even number of digits link
    Then The user should be redirected to "QUESTION" page contains a question,an tryEditor with Run and Submit buttons

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

  @PythonEdito
  Scenario: Practice Questions page
    Given The user is on Practice page
    When The user clicks squared of the sorted array link
    Then The user should be redirected to "QUESTION" page contains a question,an tryEditor with Run and Submit buttons

  @PythonEditor_Blank
  Scenario: Python Editor page without data
    Given The user is on tryEditor page
    When The user clicks the run button without entring the code in the Editor
    Then Nothing happens to the page and no error message is displayed


  @PythonEditor_Inalid
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

  Scenario: User is on Python  editor page
    Given The user is already on Python Editor page
    When User clicks the submit button int try editor
    Then User gets an warning message " No tests were collected" in the console
