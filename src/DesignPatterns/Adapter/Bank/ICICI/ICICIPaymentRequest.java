package DesignPatterns.Adapter.Bank.ICICI;

public class ICICIPaymentRequest {
    String fromAccount;
    String toAccount;

    public ICICIPaymentRequest(String fromAccount, String toAccount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }
}
