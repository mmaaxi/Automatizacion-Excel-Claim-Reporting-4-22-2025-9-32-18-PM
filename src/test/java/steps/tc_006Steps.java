package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page page = new tc_006Page();

    @Given("el usuario introduce datos de pago incluyendo descuentos, IVA descuento, ISR, Impuesto cedular, IVA acumulable y IVA retenido")
    public void elUsuarioIntroduceDatosDePago() {
        page.introducirDatosPago(1000, 50, 100, 30, 20, 10, 5);
    }

    @When("el sistema calcula el total en 'Monto Acumulado Folio OPC (2121)'")
    public void elSistemaCalculaElTotal() {
        page.calcularMontoAcumulado();
    }

    @Then("el total debe coincidir con la suma de los componentes indicados")
    public void elTotalDebeCoincidir() {
        double expected = 885; // Calculated as per the formula
        double actual = page.obtenerMontoAcumulado();
        Assert.assertEquals(expected, actual, 0.01);
    }
}