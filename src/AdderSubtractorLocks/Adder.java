package AdderSubtractorLocks;

import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    Value v;
    Lock lock;

    public Adder(Value v, Lock lock){
        this.v = v;
        this.lock = lock;
    }
    @Override
    public Void call() throws Exception {
//        lock.lock();
        for(int i=1;i<=1000;i++){
            lock.lock();
            System.out.println("Addition taking place : " + v.count);
            v.count = v.count + i;
            lock.unlock();
        }
//        lock.unlock();

        return null;
    }
}
