package DesignPatterns.Adapter.PhonePe;

public class Payment {
    boolean makePayment(String fromAccount, String toAccount, int amount, YesBankAPI api){
        if(api.checkBalance(fromAccount) > amount){
           return api.transferMoney(fromAccount, toAccount, amount);
        }
        return false;
    }
}
