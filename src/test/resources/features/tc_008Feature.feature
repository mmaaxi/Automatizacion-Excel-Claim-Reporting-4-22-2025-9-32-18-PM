Feature: Validar integracion con el modulo Cash para columnas sin valor

  Scenario: Verificacion de columnas en Excel exportado
    Given el usuario está en la página del módulo Cash
    When el usuario genera el reporte y exporta el archivo Excel
    Then el Excel muestra las columnas 'Folio Pre solicitud' y 'Folio de Pago' sin valores
    
  Scenario: Verificación de consistencia de datos con módulo Cash
    Given el usuario ha exportado el reporte en Excel
    When el usuario compara los datos del Excel con el módulo Cash
    Then no se presentan errores de sincronización entre ambos módulos