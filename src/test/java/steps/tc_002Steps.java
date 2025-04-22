package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertTrue;
import pages.tc_002Page;

public class tc_002Steps {
    tc_002Page page = new tc_002Page();

    @When("I verify the presence of the 'Estado Código' column in the specified position")
    public void verifyEstadoCodigoColumnPosition() {
        assertTrue(page.isEstadoCodigoColumnInPosition());
    }

    @Then("I should see the 'Estado Código' column next to the specified column")
    public void verifyEstadoCodigoColumnPresence() {
        assertTrue(page.isEstadoCodigoColumnPresent());
    }

    @Then("the columns should appear empty as defined in HU 3676803")
    public void verifyColumnsAppearEmpty() {
        assertTrue(page.areNewColumnsEmpty());
    }

    @And("I confirm the addition of 'Folio Pre solicitud', 'Folio de Pago', and 'Status Pago Código' columns")
    public void confirmNewColumnsAddition() {
        assertTrue(page.areNewColumnsAdded());
    }
}