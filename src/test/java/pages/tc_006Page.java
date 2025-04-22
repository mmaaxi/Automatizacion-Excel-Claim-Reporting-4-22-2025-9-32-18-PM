package pages;

public class tc_006Page {

    private double montoPrincipal;
    private double descuento;
    private double ivaDescuento;
    private double isr;
    private double impuestoCedular;
    private double ivaAcumulable;
    private double ivaRetenido;
    private double montoAcumulado;

    public void introducirDatosPago(double monto, double descuento, double ivaDescuento, double isr, double impuestoCedular, double ivaAcumulable, double ivaRetenido) {
        this.montoPrincipal = monto;
        this.descuento = descuento;
        this.ivaDescuento = ivaDescuento;
        this.isr = isr;
        this.impuestoCedular = impuestoCedular;
        this.ivaAcumulable = ivaAcumulable;
        this.ivaRetenido = ivaRetenido;
    }

    public void calcularMontoAcumulado() {
        montoAcumulado = montoPrincipal - descuento - ivaDescuento - isr - impuestoCedular + ivaAcumulable - ivaRetenido;
    }

    public double obtenerMontoAcumulado() {
        return montoAcumulado;
    }
}