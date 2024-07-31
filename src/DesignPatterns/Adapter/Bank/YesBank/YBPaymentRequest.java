package DesignPatterns.Adapter.Bank.YesBank;

public class YBPaymentRequest {
    String fromAccount;
    String toAccount;
    int amount;

    public YBPaymentRequest(String fromAccount, String toAccount, int amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }
}
