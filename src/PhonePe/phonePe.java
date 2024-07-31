package PhonePe;

public class phonePe {
//    YesBankUPI upi = new YesBankUPI();
//
//    int getBalance(String accnt){
//        return upi.getBalance(accnt);
//    }
//
//    void transfer(String accntFrm, String accntTo){
//        upi.transferMoney(accntFrm, accntTo);
//    }

//    ICICIBankUPI upi = new ICICIBankUPI();
//
//    int getBalance(String accnt){
//        return upi.fetchBalance(accnt);
//    }
//
//    void transfer(String accntFrm, String accntTo){
//        upi.sendMoney(accntFrm, accntTo);
//     }


    //2nd Scenario
    UnifiedUPInterface upi = new ICICIBankUPI();

    int getBalance(String accnt){
        return upi.checkBalance(accnt);
    }

    void transfer(String accntFrm, String accntTo){
        upi.transfer(accntFrm, accntTo);
    }
}
