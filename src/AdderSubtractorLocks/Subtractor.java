package AdderSubtractorLocks;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    Value v;
    Lock lock;

    public Subtractor(Value v, Lock lock){
        this.v = v;
        this.lock = lock;
    }
    @Override
    public Void call() throws Exception {
//        lock.lock();
        for(int i=1;i<=1000;i++){
            lock.lock();
            System.out.println("Subtraction taking place : " + v.count);
            v.count = v.count - i;
            lock.unlock();
        }
//        lock.unlock();
        return null;
    }
}
