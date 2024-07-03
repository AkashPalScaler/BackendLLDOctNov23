package ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements  Runnable{
    private Store store;
    private Semaphore prodSema;
    private Semaphore consSema;

    Consumer(Store st, Semaphore prodSema, Semaphore consSema){
        this.store = st;
        this.prodSema = prodSema;
        this.consSema = consSema;
    }
    @Override
    public void run() {
        while(true){
            try{
                consSema.acquire(); //consumer--;
            }catch(Exception e){
                System.out.println("Exception occured " + e.getMessage());
            }
            store.removeItem(); //3 consumer threads comes in here
            prodSema.release();//producer++; //prodSema = 3
        }
    }
}
