package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class tc_005Page {

    WebDriver driver;
    WebDriverWait wait;

    // Locators
    By reservationAmountInput = By.id("reservationAmountInput");
    By calculatedValue = By.id("calculatedValue");
    By manualValue = By.id("manualValue");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    // Navigate to reservation system page
    public void navigateToReservationSystem() {
        driver.get("http://example.com/reservationPage");
    }

    // Simulate entry of reservation amounts with known values
    public void enterReservationAmounts() {
        WebElement input = driver.findElement(reservationAmountInput);
        input.clear();
        input.sendKeys("1000");
        // Assume additional logic to submit form if required
    }

    // Verify if system calculation is accurate
    public boolean isCalculationAccurate() {
        String calculatedText = driver.findElement(calculatedValue).getText();
        double calculatedTotal = Double.parseDouble(calculatedText);
        // Assume previous value is 500 for demonstration purposes
        return calculatedTotal == 1500.0;
    }

    // Check if the calculated value matches manual calculation
    public boolean doValuesMatchManualCalculation() {
        String calculatedText = driver.findElement(calculatedValue).getText();
        String manualText = driver.findElement(manualValue).getText();
        return calculatedText.equals(manualText);
    }
}