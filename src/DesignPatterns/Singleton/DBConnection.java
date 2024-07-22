package DesignPatterns.Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConnection {
    //Eager initialisation(during class loading)
    //Problems: App startup time more, Custom params not possible, wastage of object(if not used)
//    private static DBConnection dbInstance = new DBConnection("localhost:8000", "devakash");

    private static DBConnection dbInstance;
    String url;
    String username;
    static Lock lock = new ReentrantLock();



    private DBConnection(String url, String username){
        this.url = url;
        this.username = username;
    }

    static DBConnection getInstance(String url, String username){
       if(dbInstance == null){
                lock.lock();
               if(dbInstance == null){
                   dbInstance = new DBConnection(url, username);
               }
                lock.unlock();
           }
       return dbInstance;
    }

}
