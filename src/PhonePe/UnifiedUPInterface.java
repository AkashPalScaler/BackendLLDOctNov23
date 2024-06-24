package PhonePe;

public interface UnifiedUPInterface {
    int checkBalance(String accntNo);
    void transfer(String accntFrom, String accntTo);
}
