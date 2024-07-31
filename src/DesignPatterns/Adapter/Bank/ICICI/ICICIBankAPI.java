package DesignPatterns.Adapter.Bank.ICICI;

public class ICICIBankAPI {
    int amount;
    public int fetchBalance(String account){
        return 0;
    }

    public void setTransferingAmount(int amount){
        this.amount = amount;
    }

    public ICICIPaymentResponse sendMoney(ICICIPaymentRequest pr){
        //Use the payment request
        ICICIPaymentResponse paymentResponse = new ICICIPaymentResponse("Payment Success", true, 12334);
        System.out.println("Transfering money");
        return paymentResponse;
    }
}
