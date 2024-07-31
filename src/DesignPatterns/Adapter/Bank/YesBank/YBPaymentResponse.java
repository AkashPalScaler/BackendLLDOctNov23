package DesignPatterns.Adapter.Bank.YesBank;

public class YBPaymentResponse {
    public String message;
    public boolean error;
    public String transaction;

    public YBPaymentResponse(String message, boolean error, String transaction) {
        this.message = message;
        this.error = error;
        this.transaction = transaction;
    }
}
