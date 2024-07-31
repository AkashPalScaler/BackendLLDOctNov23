package DesignPatterns.Adapter.PhonePeAdapter;

public interface UPIInterface {
    int getBalance(String account);
    PhonePePaymentResponse transfer(PhonePePaymentRequest paymentRequest);
}
