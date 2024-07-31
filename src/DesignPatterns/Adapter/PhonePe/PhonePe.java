package DesignPatterns.Adapter.PhonePe;

public class PhonePe {
    String account;
    YesBankAPI api;
    PhonePeLoan phonePeLoan = new PhonePeLoan();
    Payment payment = new Payment();

    public PhonePe(String account){
        this.account = account;
        api = new YesBankAPI();
    }
    boolean checkLoan(){
        return phonePeLoan.checkLoan(account, api);
    }

    boolean transferMoney(String toAccount, int amount){
        return payment.makePayment(account, toAccount, amount, api);
    }
}
