Feature: Validate generation and download of the Excel file for Claim Accounting Report

  Scenario: Generate and download Claim Accounting Report in Excel format
    Given the user accesses the 'Canned Reports > Module Claim > Report Code > Claim Accounting Report' module
    When the user executes the flow to Submit, View Log, Add Folio, and Download Excel
    Then the Excel file is generated and downloaded successfully
    And the Excel file contains the correct data and formatting