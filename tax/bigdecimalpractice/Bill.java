package tax.bigdecimalpractice;

import java.math.BigDecimal;

public class Bill {
    private BigDecimal amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(BigDecimal amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }
    public void payTaxes() {
        BigDecimal taxAmount = taxType.calculateTaxFor(amount);
        amount.subtract(taxAmount);
        taxService.payOut(taxAmount);
    }
}
