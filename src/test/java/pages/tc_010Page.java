package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {
    WebDriver driver;

    By criticalField = By.id("criticalField");
    By errorMessage = By.id("errorMessage");
    By calculatedField = By.id("calculatedField");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToDataEntryPage() {
        driver.get("http://example.com/data-entry");
    }

    public void enterNullOrEmptyValues() {
        driver.findElement(criticalField).clear();
        driver.findElement(criticalField).sendKeys("");
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }

    public boolean areDefaultValuesSet() {
        return !driver.findElement(criticalField).getAttribute("value").isEmpty();
    }

    public void enterExtremeNumericValues() {
        driver.findElement(criticalField).clear();
        driver.findElement(criticalField).sendKeys("9999999999");
        driver.findElement(criticalField).sendKeys("-9999999999");
    }

    public boolean didFormulasExecuteCorrectly() {
        String calculatedValue = driver.findElement(calculatedField).getText();
        return !calculatedValue.isEmpty() && !calculatedValue.contains("error");
    }
}