package ProducerConsumerSemaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private int maxSize; //Number of shelves present
    private ConcurrentLinkedDeque<Object> items; //Actual shelves //Thread Safe data structure

    Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedDeque<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public ConcurrentLinkedDeque<Object> getItems() {
        return items;
    }

    public void addItem() {
        System.out.println("Producer producing, current size " + this.items.size());
        this.items.add(new Object());
//        System.out.println("Producer produced time, current size " + this.items.size());
    }

    public void removeItem() {
        System.out.println("Consumer consuming, current size " + this.items.size());
        this.items.remove();
        // this.item.remove(items.getSize()-1);
        // All 3 threads read ->5-1 = 4th index to be removed
        //1st thread will remove the 4th element successfully,
        // but do you think the next 2 threads will remove anything
        // ProducerSemaphore will be increased to 3
        // listSize will remain 4, but now 3 prodSema's will increase listSize to 7
//        System.out.println("Consumer item, current size " + this.items.size());
    }
}
