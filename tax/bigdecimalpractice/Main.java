package tax.bigdecimalpractice;


import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Bill[] payments = new Bill[] {
                new Bill(new BigDecimal("150259"), new IncomeTaxType(), new TaxService()),
                new Bill(new BigDecimal("145478"), new ProgressiveTaxType(), new TaxService()),
                new Bill(new BigDecimal("240431"), new VATaxType(), new TaxService())

        };
        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
}
