package DesignPatterns.Singleton;

public class Client {
    public static void main(String[] args) {
        DBConnection dbConn1 = DBConnection.getInstance("localhost", "akash");
        DBConnection dbConn2 = DBConnection.getInstance("localhost", "akash");
        DBConnection dbConn3 = DBConnection.getInstance("localhost", "akash");
        System.out.println("DEBUG");
    }
}
