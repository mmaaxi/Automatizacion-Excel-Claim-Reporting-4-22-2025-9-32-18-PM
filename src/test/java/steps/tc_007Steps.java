package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_007Page;
import static org.junit.Assert.assertTrue;

public class tc_007Steps {

    tc_007Page page = new tc_007Page();

    @Given("el usuario está en la página de registro de IVA")
    public void el_usuario_esta_en_la_pagina_de_registro_de_iva() {
        page.navigateToRegistroIVA();
    }

    @When("aplica diferentes porcentajes de IVA en los registros")
    public void aplica_diferentes_porcentajes_de_IVA_en_los_registros(Map<String, String> dataTable) {
        dataTable.forEach((tipo, porcentaje) -> page.applyVATType(type, percentage));
    }

    @When("aplica un IVA retenido de 10%")
    public void aplica_un_IVA_retenido_de_10() {
        page.applyRetainedVAT("10%");
    }

    @Then("el sistema calcula correctamente el IVA acumulado excluyendo el IVA retenido")
    public void el_sistema_calcula_correctamente_el_IVA_acumulado_excluyendo_el_IVA_retenido() {
        assertTrue("El cálculo del IVA acumulado es incorrecto.", page.isAccumulatedVATCorrect());
    }
}