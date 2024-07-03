package ProducerConsumerSemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        int storeSize = 5;
        Store store  = new Store(storeSize);
        Semaphore prodSema = new Semaphore(storeSize);
        Semaphore consSema = new Semaphore(0);
        for(int i = 1; i<=8; ++i){
            ex.execute(new Producer(store, prodSema, consSema));
        }
        for(int i = 1 ; i <= 8; ++i){
            ex.execute(new Consumer(store, prodSema, consSema));
        }
    }
}
