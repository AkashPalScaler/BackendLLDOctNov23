package DesignPatterns.Adapter.PhonePeAdapter;

import DesignPatterns.Adapter.Bank.ICICI.ICICIBankAPI;
import DesignPatterns.Adapter.Bank.ICICI.ICICIPaymentRequest;
import DesignPatterns.Adapter.Bank.ICICI.ICICIPaymentResponse;
import DesignPatterns.Adapter.Bank.YesBank.YBPaymentRequest;
import DesignPatterns.Adapter.Bank.YesBank.YBPaymentResponse;

public class ICICIBankAdapter implements UPIInterface{
    ICICIBankAPI api = new ICICIBankAPI();
    @Override
    public int getBalance(String account) {
        return api.fetchBalance(account);
    }

    @Override
    public PhonePePaymentResponse transfer(PhonePePaymentRequest paymentRequest) {
        //Transform phone input to yesbank input
        ICICIPaymentRequest ipaymentRequest = new ICICIPaymentRequest(paymentRequest.fromAccount, paymentRequest.toAccount);

        //Call Api
        api.setTransferingAmount(paymentRequest.amount);
        ICICIPaymentResponse ipaymentResponse = api.sendMoney(ipaymentRequest);

        //Transform yes bank response to phone output
        PhonePePaymentResponse paymentResponse = new PhonePePaymentResponse(ipaymentResponse.success, ipaymentResponse.message);

        return paymentResponse;
    }
}
