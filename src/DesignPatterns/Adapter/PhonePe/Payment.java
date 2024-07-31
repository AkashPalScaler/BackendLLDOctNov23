package DesignPatterns.Adapter.PhonePe;

import DesignPatterns.Adapter.Bank.ICICI.ICICIBankAPI;
import DesignPatterns.Adapter.Bank.ICICI.ICICIPaymentRequest;
import DesignPatterns.Adapter.Bank.ICICI.ICICIPaymentResponse;
import DesignPatterns.Adapter.Bank.YesBank.YBPaymentRequest;
import DesignPatterns.Adapter.Bank.YesBank.YBPaymentResponse;
import DesignPatterns.Adapter.Bank.YesBank.YesBankAPI;

public class Payment {
    boolean makePayment(String fromAccount, String toAccount, int amount, YesBankAPI api){

        if(api.checkBalance(fromAccount) > amount){
            YBPaymentRequest paymentRequest = new YBPaymentRequest(fromAccount, toAccount, amount);
            YBPaymentResponse paymentResponse =  api.transferMoney(paymentRequest);
            return !paymentResponse.error;
        }
        return false;
    }

    //Dispute Payment
    //Ask for details

}
