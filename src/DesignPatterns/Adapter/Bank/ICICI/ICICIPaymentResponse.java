package DesignPatterns.Adapter.Bank.ICICI;

public class ICICIPaymentResponse {
    public String message;
    public boolean success;
    public int transactionID;

    public ICICIPaymentResponse(String message, boolean success, int transactionID) {
        this.message = message;
        this.success = success;
        this.transactionID = transactionID;
    }
}
