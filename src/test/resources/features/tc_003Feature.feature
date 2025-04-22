Feature: Column Name and Formula Update Validation

  Scenario: Validate update of column names and formulas
    Given I am on the table view page
    When I review the column previously named "Status de Pago"
    Then the column should be renamed to "Descripción Status Pago"
    When I check the column "Monto Acumulado Folio OPC"
    Then it should be updated to "Monto Acumulado Folio OPC (2121)"
    And the updated formulas should be applied correctly