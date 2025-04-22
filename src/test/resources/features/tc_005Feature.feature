Feature: Validate formula for 'Accumulated Amount Folio Reservation 5401'

  Scenario: Calculate the accumulated reservation amount for Folio 5401 
    Given I am on the reservation system page
    When I simulate entry of reservation amounts with known values
    Then the sum of previous and current accumulated reservation amounts should be calculated accurately
    And the calculated system values should match the manual calculations