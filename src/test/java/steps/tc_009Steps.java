package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_009Page;

public class tc_009Steps {
  
    tc_009Page regressionPage = new tc_009Page();

    @Given("^the existing functionalities are reviewed for potential effects$")
    public void review_existing_functionalities() {
        regressionPage.reviewExistingFunctionalities();
    }

    @When("^previous test cases are executed and results are compared$")
    public void execute_previous_test_cases() {
        regressionPage.executeAndCompareTestCases();
    }

    @Then("^historical functionalities of the system should operate without alteration$")
    public void validate_no_alteration_in_functionalities() {
        regressionPage.validateFunctionalitiesUnaffected();
    }

    @Then("^no failures or inconsistencies should be derived from new changes$")
    public void verify_no_failures_or_inconsistencies() {
        regressionPage.verifyNoFailuresOrInconsistencies();
    }
}