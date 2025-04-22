Feature: Validar la fórmula de concatenación en la llave (Columna C)

  Scenario Outline: Verificar la concatenación de la llave en la Columna C
    Given que estoy en el documento Excel
    When verifico la fórmula CONCATENATE en la celda <celda>
    Then la llave se genera correctamente con los valores concatenados
    Examples:
      | celda |
      | C2    |
      | C3    |
      | C4    |

  Scenario Outline: Probar concatenación con diferentes sets de datos
    Given que tengo el set de datos:
      | No. Siniestro | No. de autorización | Status | Tipo de Mov | No. de movimiento |
      | 12345         | 67890               | OPEN   | TYPE1       | 001               |
      | 54321         | 09876               | CLOSED | TYPE2       | 002               |
    When aplico la fórmula CONCATENATE en la celda <celda>
    Then la fórmula concatena correctamente los valores en cada caso
    Examples: 
      | celda |
      | C2    |
      | C3    |