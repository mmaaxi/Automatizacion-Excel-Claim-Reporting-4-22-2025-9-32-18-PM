package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.tc_010Page;
import static org.junit.Assert.*;

public class tc_010Steps {
    WebDriver driver;
    WebDriverWait wait;
    tc_010Page page;

    @Given("the user is on the data entry page")
    public void the_user_is_on_the_data_entry_page() {
        driver = Hooks.getDriver();
        wait = new WebDriverWait(driver, 10);
        page = new tc_010Page(driver);
        page.navigateToDataEntryPage();
    }

    @When("the user enters null or empty values in critical fields")
    public void the_user_enters_null_or_empty_values_in_critical_fields() {
        page.enterNullOrEmptyValues();
    }

    @Then("the system should display controlled error messages or appropriate default values")
    public void the_system_should_display_controlled_error_messages_or_appropriate_default_values() {
        assertTrue("Error message is not displayed", page.isErrorMessageDisplayed());
        assertTrue("Default values are not set correctly", page.areDefaultValuesSet());
    }

    @When("the user enters extremely high or low numeric values")
    public void the_user_enters_extremely_high_or_low_numeric_values() {
        page.enterExtremeNumericValues();
    }

    @Then("the formulas should execute without overflow or precision errors")
    public void the_formulas_should_execute_without_overflow_or_precision_errors() {
        assertTrue("Formulas did not execute correctly", page.didFormulasExecuteCorrectly());
    }
}