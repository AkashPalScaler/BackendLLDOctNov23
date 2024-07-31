package DesignPatterns.Adapter.PhonePeAdapter;

public class PhonePePaymentRequest {
    String toAccount;
    String fromAccount;
    int amount;

    public PhonePePaymentRequest(String toAccount, String fromAccount, int amount) {
        this.toAccount = toAccount;
        this.fromAccount = fromAccount;
        this.amount = amount;
    }
}
