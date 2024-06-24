package PhonePe;

public class YesBankUPI implements UnifiedUPInterface{
//    int getBalance(String accnt){
//        System.out.println("GetBalance of YEs BANK");
//        return 0;
//    }
//    void transferMoney(String accntFrom, String accntTo){
//        System.out.println("Transfering money through Yesbank");
//    }


    @Override
    public int checkBalance(String accntNo) {
        System.out.println("GetBalance of YEs BANK");
        //api calls to the actual bank
        return 0;
    }

    @Override
    public void transfer(String accntFrom, String accntTo) {
        System.out.println("Transfering money through Yesbank");
    }
}
