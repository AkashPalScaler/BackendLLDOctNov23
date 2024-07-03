package AddedSubtractorDeadLock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Lock lock = new ReentrantLock();
        Lock lock2 = new ReentrantLock();//Extrinsic Lock
        Adder adder = new Adder(v, lock, lock2);
        Subtractor subtractor = new Subtractor(v, lock, lock2);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> addF = es.submit(adder);
        Future<Void> addS = es.submit(subtractor);

        addF.get(); //Constantly checkking on the task, is it over?
        addS.get();

        System.out.println("Value count : " + v.count);
    }
}
