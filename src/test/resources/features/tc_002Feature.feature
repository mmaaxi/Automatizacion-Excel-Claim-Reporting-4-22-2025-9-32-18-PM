Feature: Validate addition of new fields to Excel

  Scenario: Validate new column additions in Excel document
    Given I open the Excel document in the application
    When I verify the presence of the 'Estado Código' column in the specified position
    Then I should see the 'Estado Código' column next to the specified column
    And I confirm the addition of 'Folio Pre solicitud', 'Folio de Pago', and 'Status Pago Código' columns
    Then the columns should appear empty as defined in HU 3676803