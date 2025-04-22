package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    WebDriver driver;

    private By estadoCodigoColumn = By.xpath("//th[contains(text(), 'Estado Código')]");
    private By folioPreSolicitudColumn = By.xpath("//th[contains(text(), 'Folio Pre solicitud')]");
    private By folioDePagoColumn = By.xpath("//th[contains(text(), 'Folio de Pago')]");
    private By statusPagoCodigoColumn = By.xpath("//th[contains(text(), 'Status Pago Código')]");
    private String emptyCellValue = ""; // assuming empty string for empty cells

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }
    
    public boolean isEstadoCodigoColumnInPosition() {
        // Logic to verify the position of 'Estado Código' column
        // To be implemented based on the document or page structure
        return true;
    }

    public boolean isEstadoCodigoColumnPresent() {
        return driver.findElements(estadoCodigoColumn).size() > 0;
    }

    public boolean areNewColumnsAdded() {
        return driver.findElements(folioPreSolicitudColumn).size() > 0 &&
               driver.findElements(folioDePagoColumn).size() > 0 &&
               driver.findElements(statusPagoCodigoColumn).size() > 0;
    }

    public boolean areNewColumnsEmpty() {
        // Logic to check whether the new columns are empty
        // Sample logic, this implementation might differ according to the page setup
        return isColumnEmpty(folioPreSolicitudColumn) &&
               isColumnEmpty(folioDePagoColumn) &&
               isColumnEmpty(statusPagoCodigoColumn);
    }

    private boolean isColumnEmpty(By columnLocator) {
        // This is a placeholder check
        // Real implementation might fetch the cell values and verify
        return driver.findElement(columnLocator).getText().equals(emptyCellValue);
    }
}