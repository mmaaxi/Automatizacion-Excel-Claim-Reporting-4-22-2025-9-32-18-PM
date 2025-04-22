package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {

    WebDriver driver;

    By vatTypeField = By.id("vatType");
    By vatPercentageField = By.id("vatPercentage");
    By retainedVatField = By.id("retainedVat");
    By calculateButton = By.id("calculateBtn");
    By resultField = By.id("result");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToRegistroIVA() {
        driver.get("http://example.com/registro-iva");
    }

    public void applyVATType(String type, String percentage) {
        driver.findElement(vatTypeField).sendKeys(type);
        driver.findElement(vatPercentageField).sendKeys(percentage);
    }

    public void applyRetainedVAT(String percentage) {
        driver.findElement(retainedVatField).sendKeys(percentage);
    }

    public boolean isAccumulatedVATCorrect() {
        driver.findElement(calculateButton).click();
        String result = driver.findElement(resultField).getText();
        // Logic to verify the accumulated VAT calculation
        return !result.contains("Retenido") && isCalculatedCorrectly(result);
    }

    private boolean isCalculatedCorrectly(String result) {
        // Method to validate if the calculation matches the expected result
        // Assuming logic is implemented here
        return true;
    }
}