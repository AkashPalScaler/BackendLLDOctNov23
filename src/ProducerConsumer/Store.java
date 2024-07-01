package ProducerConsumer;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize; //Number of shelves present
    private List<Object> items; //Actual shelves

    Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public List<Object> getItems() {
        return items;
    }

    public void addItem() {
        System.out.println("Producer producing, current size " + this.items.size());
        this.items.add(new Object());
//        System.out.println("Producer produced time, current size " + this.items.size());
    }

    public void removeItem() {
        System.out.println("Consumer consuming, current size " + this.items.size());
        this.items.remove(this.items.size() - 1);
//        System.out.println("Consumer item, current size " + this.items.size());
    }
}
