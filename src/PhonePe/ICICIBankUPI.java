package PhonePe;

public class ICICIBankUPI implements UnifiedUPInterface {
//    int fetchBalance(String userID){
//        System.out.println("GetBalance of ICICI BANK");
//        return 0;
//    }
//    void sendMoney(String accntTo, String accntFrom){
//        System.out.println("Trasfering money through ICICI");
//    }

    @Override
    public void transfer(String accntFrom, String accntTo) {
        System.out.println("Trasfering money through ICICI");
    }

    @Override
    public int checkBalance(String accntNo) {
        System.out.println("GetBalance of ICICI BANK");
        return 0;
    }
}
