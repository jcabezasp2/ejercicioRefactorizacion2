import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvoiceTest {

    @Test
    void priceWithIvaReduced() {
        Invoice invoice = new Invoice(100);
        invoice.applyReducedIVA();
        double expected = 110;
        double actual = invoice.getTotal();
        assertEquals(expected, actual);
    }

    @Test
    void iva() {
        Invoice invoice = new Invoice(100);
        invoice.applyIva();
        double expected = 121;
        double actual = invoice.getTotal();
        assertEquals(expected, actual);
    }

    @Test
    void priceWithSpecialDiscount() {
        Invoice invoice = new Invoice(100);
        invoice.applyIvaAndSpecialDiscount();
        double expected = 116.16;
        double actual = invoice.getTotal();
        assertEquals(expected, actual);
    }
}