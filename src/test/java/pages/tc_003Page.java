package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;

public class tc_003Page {
    
    WebDriver driver;

    By statusPagoColumn = By.xpath("//th[contains(text(),'Status de Pago')]");
    By descripcionStatusPagoColumn = By.xpath("//th[contains(text(),'Descripción Status Pago')]");
    By montoAcumuladoFolioColumn = By.xpath("//th[contains(text(),'Monto Acumulado Folio OPC')]");
    By updatedMontoAcumuladoFolioColumn = By.xpath("//th[contains(text(),'Monto Acumulado Folio OPC (2121)')]");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToTableViewPage() {
        driver.get("http://url-to-table-view-page");
    }

    public void reviewColumnName(String oldName) {
        WebElement column = driver.findElement(By.xpath("//th[contains(text(),'" + oldName + "')]"));
        assertTrue(column.isDisplayed());
    }

    public String getReviewedColumnName() {
        WebElement column = driver.findElement(descripcionStatusPagoColumn);
        return column.getText();
    }

    public void checkColumnName(String columnName) {
        WebElement column = driver.findElement(By.xpath("//th[contains(text(),'" + columnName + "')]"));
        assertTrue(column.isDisplayed());
    }

    public String getUpdatedColumnName() {
        WebElement column = driver.findElement(updatedMontoAcumuladoFolioColumn);
        return column.getText();
    }
    
    public void verifyUpdatedFormulas() {
        // Implement logic to verify formulas if necessary
        // For example, checking calculated values within the column
    }
}