Feature: Validar la fórmula en 'Monto Acumulado Folio OPC (2121)' para movimientos de pago

  Scenario: Verificar cálculo correcto del monto acumulado
    Given el usuario introduce datos de pago incluyendo descuentos, IVA descuento, ISR, Impuesto cedular, IVA acumulable y IVA retenido
    When el sistema calcula el total en 'Monto Acumulado Folio OPC (2121)'
    Then el total debe coincidir con la suma de los componentes indicados