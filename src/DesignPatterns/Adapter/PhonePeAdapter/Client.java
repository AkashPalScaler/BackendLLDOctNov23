package DesignPatterns.Adapter.PhonePeAdapter;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe("1298236", new ICICIBankAdapter());

    }
}
