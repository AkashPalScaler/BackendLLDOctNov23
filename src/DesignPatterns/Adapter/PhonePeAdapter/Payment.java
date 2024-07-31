package DesignPatterns.Adapter.PhonePeAdapter;

import DesignPatterns.Adapter.Bank.YesBank.YBPaymentRequest;
import DesignPatterns.Adapter.Bank.YesBank.YBPaymentResponse;
import DesignPatterns.Adapter.Bank.YesBank.YesBankAPI;

public class Payment {
    boolean makePayment(String fromAccount, String toAccount, int amount, UPIInterface api){

        if(api.getBalance(fromAccount) > amount){
            PhonePePaymentRequest paymentRequest = new PhonePePaymentRequest(fromAccount, toAccount, amount);
            PhonePePaymentResponse paymentResponse =  api.transfer(paymentRequest);
            return paymentResponse.success;
        }
        return false;
    }
}
