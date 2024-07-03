package ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;
    private Semaphore prodSema;
    private Semaphore consSema;
    Producer(Store st, Semaphore prodSema, Semaphore consSema) {
        this.store = st;
        this.prodSema = prodSema;
        this.consSema = consSema;
    }
    @Override
    public void run() {
        while(true){
            try{
                prodSema.acquire(); //producer --;
            }catch(Exception e){
                System.out.println("Exception occured");
            }
            store.addItem();
            consSema.release(); //consumer ++;
        }
    }
}
