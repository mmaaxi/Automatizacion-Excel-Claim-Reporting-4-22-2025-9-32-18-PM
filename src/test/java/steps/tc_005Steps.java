package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_005Page;
import org.junit.Assert;

public class tc_005Steps {

    tc_005Page reservationPage = new tc_005Page();

    @Given("I am on the reservation system page")
    public void i_am_on_the_reservation_system_page() {
        reservationPage.navigateToReservationSystem();
    }

    @When("I simulate entry of reservation amounts with known values")
    public void i_simulate_entry_of_reservation_amounts_with_known_values() {
        reservationPage.enterReservationAmounts();
    }

    @Then("the sum of previous and current accumulated reservation amounts should be calculated accurately")
    public void the_sum_of_previous_and_current_accumulated_reservation_amounts_should_be_calculated_accurately() {
        Assert.assertTrue(reservationPage.isCalculationAccurate());
    }

    @Then("the calculated system values should match the manual calculations")
    public void the_calculated_system_values_should_match_the_manual_calculations() {
        Assert.assertTrue(reservationPage.doValuesMatchManualCalculation());
    }
}