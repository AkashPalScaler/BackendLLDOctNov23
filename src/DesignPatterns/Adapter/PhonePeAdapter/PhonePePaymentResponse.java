package DesignPatterns.Adapter.PhonePeAdapter;

public class PhonePePaymentResponse {
    boolean success;
    String message;

    public PhonePePaymentResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
