package AdderSubtractorSynchronised;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    Value v;
    Test t;
    public Adder(Value v, Test t){
        this.v = v;
        this.t = t;
    }
    @Override
    public Void call() throws Exception {
        for(int i=1;i<=10000;i++){
            synchronized (v){ //t.Lock.lock() ->using the lock of the object
                v.count = v.count + i;
            } //t.lock.unlock()
        }
        return null;
    }
}
