package io.codelex.oop2.summary.Exercise2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Invoice {

    private final List<AbstractItem> order;
    private String invoiceNumber;
    private final BigDecimal vat = new BigDecimal(0.21);
    InvoiceStatus status = InvoiceStatus.APPROVED;
    private BigDecimal priceWithoutVat;
    private BigDecimal priceWithVat;

    public Invoice(String invoiceNumber, Order order) {
        this.invoiceNumber = invoiceNumber;
        this.priceWithoutVat = sum();
        this.priceWithVat = calculateVatOfItem();
        this.order = order.getOrder();
    }

    public void send() {
        status = InvoiceStatus.SENT;
    }

    public BigDecimal calculateVatOfItem() {
        return priceWithoutVat.add(priceWithoutVat.multiply(vat).setScale(2, RoundingMode.HALF_UP));
    }

    public BigDecimal sum() {
        return order.stream().map(AbstractItem::returnPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public String printInvoice() {
        StringBuilder result = new StringBuilder();
        result.append("= INVOICE NUMBER ").append(this.invoiceNumber).append("\n")
                .append("= STATUS: ").append(this.status).append("\n");
        for (int i = 0; i < order.size(); i++) {
            result.append(i).append(1).append(". ").append(order.get(i).fullInfo()).append("\n");
        }
        result.append("= SUM: ")
                .append(priceWithoutVat).append("EUR").append("\n")
                .append("= VAT (21%):").append(calculateVatOfItem()).append("EUR").append("\n")
                .append("= TOTAL: ").append(priceWithVat).append("EUR").append("\n");
        return result.toString();
    }
}
