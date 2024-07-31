package DesignPatterns.Adapter.PhonePeAdapter;

import DesignPatterns.Adapter.Bank.YesBank.YesBankAPI;

public class PhonePeLoan {
    boolean checkLoan(String account, UPIInterface api){
        if(api.getBalance(account) > 10000){
            return true;
        }
        return false;
    }
}
