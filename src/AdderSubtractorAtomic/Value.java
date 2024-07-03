package AdderSubtractorAtomic;

import java.util.concurrent.atomic.AtomicInteger;


public class Value {
    AtomicInteger count;//Default 0

    public Value(){
        count = new AtomicInteger(0);
    }
}
