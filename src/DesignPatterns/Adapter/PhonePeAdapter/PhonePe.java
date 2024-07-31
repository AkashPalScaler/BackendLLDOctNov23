package DesignPatterns.Adapter.PhonePeAdapter;

import DesignPatterns.Adapter.Bank.YesBank.YesBankAPI;

public class PhonePe {
    String account;
    UPIInterface api;
    PhonePeLoan phonePeLoan = new PhonePeLoan();
    Payment payment = new Payment();

    public PhonePe(String account, UPIInterface api){
        this.account = account;
        this.api = api;
    }
    boolean checkLoan(){
        return phonePeLoan.checkLoan(account, api);
    }

    boolean transferMoney(String toAccount, int amount){
        return payment.makePayment(account, toAccount, amount, api);
    }
}
