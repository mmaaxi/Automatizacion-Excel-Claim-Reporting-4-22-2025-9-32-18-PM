Feature: Validate system behavior with null and extreme data

  Scenario: Handling null or empty entries in critical fields
    Given the user is on the data entry page
    When the user enters null or empty values in critical fields
    Then the system should display controlled error messages or appropriate default values

  Scenario: Handling very high or low numeric values
    Given the user is on the data entry page
    When the user enters extremely high or low numeric values
    Then the formulas should execute without overflow or precision errors