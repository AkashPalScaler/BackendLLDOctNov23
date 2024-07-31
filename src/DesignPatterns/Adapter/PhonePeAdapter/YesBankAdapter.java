package DesignPatterns.Adapter.PhonePeAdapter;

import DesignPatterns.Adapter.Bank.YesBank.YBPaymentRequest;
import DesignPatterns.Adapter.Bank.YesBank.YBPaymentResponse;
import DesignPatterns.Adapter.Bank.YesBank.YesBankAPI;

public class YesBankAdapter implements UPIInterface{
    YesBankAPI api = new YesBankAPI();
    @Override
    public int getBalance(String account) {
        return api.checkBalance(account);
    }

    @Override
    public PhonePePaymentResponse transfer(PhonePePaymentRequest paymentRequest) {
        //Transform phone input to yesbank input
        YBPaymentRequest ybpaymentRequest = new YBPaymentRequest(paymentRequest.fromAccount, paymentRequest.toAccount, paymentRequest.amount);

        //Call Api
        YBPaymentResponse ybpaymentResponse = api.transferMoney(ybpaymentRequest);

        //Transform yes bank response to phone output
        PhonePePaymentResponse paymentResponse = new PhonePePaymentResponse(!ybpaymentResponse.error, ybpaymentResponse.message);

        return paymentResponse;
    }
}
