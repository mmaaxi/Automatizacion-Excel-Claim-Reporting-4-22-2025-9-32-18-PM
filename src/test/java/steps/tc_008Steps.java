package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_008Page;
import java.io.IOException;

public class tc_008Steps {

    tc_008Page page = new tc_008Page();

    @Given("el usuario está en la página del módulo Cash")
    public void el_usuario_está_en_la_página_del_módulo_cash() {
        page.navegarAlModuloCash();
    }

    @When("el usuario genera el reporte y exporta el archivo Excel")
    public void el_usuario_genera_el_reporte_y_exporta_el_archivo_excel() {
        page.generarReporteYExportarExcel();
    }

    @Then("el Excel muestra las columnas 'Folio Pre solicitud' y 'Folio de Pago' sin valores")
    public void el_excel_muestra_las_columnas_sin_valores() throws IOException {
        Assert.assertTrue(page.validarColumnasSinValor());
    }

    @Given("el usuario ha exportado el reporte en Excel")
    public void el_usuario_ha_exportado_el_reporte_en_excel() {
        Assert.assertTrue(page.excelHaSidoExportado());
    }

    @When("el usuario compara los datos del Excel con el módulo Cash")
    public void el_usuario_compara_los_datos_del_excel_con_el_módulo_cash() {
        page.compararDatosExcelConModuloCash();
    }

    @Then("no se presentan errores de sincronización entre ambos módulos")
    public void no_se_presentan_errores_de_sincronización_entre_ambos_módulos() {
        Assert.assertFalse(page.hayErroresDeSincronizacion());
    }
}