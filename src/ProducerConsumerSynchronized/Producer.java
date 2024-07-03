package ProducerConsumerSynchronized;

public class Producer implements Runnable{
    private Store store;
    Producer(Store st) {
        this.store = st;
    }
    @Override
    public void run() {
        while(true){
            synchronized (store){ //store.lock.lock();
                //Only one thread ALLOWED
                if (store.getItems().size() < store.getMaxSize()) {
                    store.addItem();
                }
            } //store.lock.unlock();
        }
    }
}
