package AddedSubtractorDeadLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    Value v;
    Lock lock;
    Lock lock2;

    public Subtractor(Value v, Lock lock, Lock lock2){
        this.v = v;
        this.lock = lock;
        this.lock2 = lock2;
    }
    @Override
    public Void call() throws Exception {
//        lock.lock();
        for(int i=1;i<=1000;i++){
            lock2.lock();
            lock.lock();
            System.out.println("Subtraction taking place : " + v.count);
            v.count = v.count - i;
            lock2.unlock();
            lock.unlock();
        }
//        lock.unlock();
        return null;
    }
}
