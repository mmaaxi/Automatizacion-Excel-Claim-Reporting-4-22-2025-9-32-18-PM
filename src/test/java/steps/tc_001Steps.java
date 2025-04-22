package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc_001Page;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page claimReportPage;

    public tc_001Steps() {
        this.driver = Hooks.getDriver();
        claimReportPage = new tc_001Page(driver);
    }

    @Given("the user accesses the 'Canned Reports > Module Claim > Report Code > Claim Accounting Report' module")
    public void user_access_module() {
        claimReportPage.navigate_to_claim_accounting_report();
    }

    @When("the user executes the flow to Submit, View Log, Add Folio, and Download Excel")
    public void user_executes_flow() {
        claimReportPage.execute_report_workflow();
    }

    @Then("the Excel file is generated and downloaded successfully")
    public void excel_file_generated() {
        claimReportPage.verify_excel_download();
    }
    
    @Then("the Excel file contains the correct data and formatting")
    public void excel_file_contains_correct_data() {
        claimReportPage.verify_excel_content();
    }
}