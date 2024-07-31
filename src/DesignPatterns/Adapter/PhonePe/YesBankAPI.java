package DesignPatterns.Adapter.PhonePe;

public class YesBankAPI {
    public int checkBalance(String account){
        return 0;
    }

    public boolean transferMoney(String from, String to, int amount){
        System.out.println("Transfering money");
        return true;
    }
}
