package DesignPatterns.Adapter.Bank.YesBank;

import DesignPatterns.Adapter.Bank.ICICI.ICICIPaymentResponse;

public class YesBankAPI {
    public int checkBalance(String account){
        return 0;
    }

    public YBPaymentResponse transferMoney(YBPaymentRequest pr){
        YBPaymentResponse paymentResponse = new YBPaymentResponse("Payment success", false, "TXN123");
        System.out.println("Transfering money");
        return paymentResponse;
    }
}
