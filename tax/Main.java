package tax;


public class Main {
    public static void main(String[] args) {
        Bill[] payments = new Bill[] {
                new Bill(150_000, new IncomeTaxType(), new TaxService()),
                new Bill(135_000, new ProgressiveTaxType(), new TaxService()),
                new Bill(240_000, new VATaxType(), new TaxService())

        };
        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
}
