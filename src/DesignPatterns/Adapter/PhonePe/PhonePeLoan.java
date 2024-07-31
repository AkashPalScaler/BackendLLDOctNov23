package DesignPatterns.Adapter.PhonePe;

public class PhonePeLoan {
    boolean checkLoan(String account, YesBankAPI api){
        if(api.checkBalance(account) > 10000){
            return true;
        }
        return false;
    }
}
