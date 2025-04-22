Feature: Cálculo de IVA Acumulado

  Scenario: Validar el cálculo de 'IVA Acumulado'
    Given el usuario está en la página de registro de IVA
    When aplica diferentes porcentajes de IVA en los registros
      | Tipo       | Porcentaje |
      | GENERAL    | 16%        |
      | FRONTERIZO | 8%         |
      | CERO       | 0%         |
      | EXENTO     | 0%         |
    And aplica un IVA retenido de 10%
    Then el sistema calcula correctamente el IVA acumulado excluyendo el IVA retenido