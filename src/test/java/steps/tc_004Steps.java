package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_004Page;

public class tc_004Steps {

    tc_004Page page = new tc_004Page();

    @Given("que estoy en el documento Excel")
    public void queEstoyEnElDocumentoExcel() {
        page.openExcelDocument();
    }

    @When("verifico la fórmula CONCATENATE en la celda {string}")
    public void verificoLaFormulaCONCATENATEenLaCelda(String celda) {
        page.verifyConcatenateFormula(celda);
    }

    @Then("la llave se genera correctamente con los valores concatenados")
    public void laLlaveSeGeneraCorrectamente() {
        Assert.assertTrue(page.isConcatenationCorrect());
    }

    @Given("que tengo el set de datos:")
    public void queTengoElSetDeDatos(io.cucumber.datatable.DataTable dataTable) {
        page.setTestData(dataTable);
    }

    @When("aplico la fórmula CONCATENATE en la celda {string}")
    public void aplicoLaFormulaCONCATENATEenLaCelda(String celda) {
        page.applyConcatenateFormula(celda);
    }

    @Then("la fórmula concatena correctamente los valores en cada caso")
    public void laFormulaConcatenaCorrectamente() {
        Assert.assertTrue(page.isConcatenationCorrectForAll());
    }
}