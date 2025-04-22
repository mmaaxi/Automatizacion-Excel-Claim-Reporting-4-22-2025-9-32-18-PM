package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

import pages.tc_003Page;

public class tc_003Steps {

    tc_003Page page = new tc_003Page();

    @Given("I am on the table view page")
    public void i_am_on_the_table_view_page() {
        page.navigateToTableViewPage();
    }

    @When("I review the column previously named {string}")
    public void i_review_the_column_previously_named(String oldName) {
        page.reviewColumnName(oldName);
    }

    @Then("the column should be renamed to {string}")
    public void the_column_should_be_renamed_to(String newName) {
        assertEquals(newName, page.getReviewedColumnName());
    }

    @When("I check the column {string}")
    public void i_check_the_column(String columnName) {
        page.checkColumnName(columnName);
    }

    @Then("it should be updated to {string}")
    public void it_should_be_updated_to(String updatedName) {
        assertEquals(updatedName, page.getUpdatedColumnName());
    }

    @Then("the updated formulas should be applied correctly")
    public void the_updated_formulas_should_be_applied_correctly() {
        page.verifyUpdatedFormulas();
    }
}