package ProducerConsumer;

public class Consumer implements  Runnable{
    private Store store;

    Consumer(Store st){
        this.store = st;
    }
    @Override
    public void run() {
        while(true){
                if (store.getItems().size() > 0) {
                    store.removeItem();
                }
        }
    }
}
