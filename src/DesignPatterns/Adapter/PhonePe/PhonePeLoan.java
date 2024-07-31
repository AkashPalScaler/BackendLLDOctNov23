package DesignPatterns.Adapter.PhonePe;

import DesignPatterns.Adapter.Bank.ICICI.ICICIBankAPI;
import DesignPatterns.Adapter.Bank.YesBank.YesBankAPI;

public class PhonePeLoan {
    boolean checkLoan(String account, YesBankAPI api){
        if(api.checkBalance(account) > 10000){
            return true;
        }
        return false;
    }
    //GetLoan
    //Disemberse
}
