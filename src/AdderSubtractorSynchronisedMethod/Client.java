package AdderSubtractorSynchronisedMethod;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Adder adder = new Adder(v);
        Subtractor subtractor = new Subtractor(v);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> addF = es.submit(adder);
        Future<Void> addS = es.submit(subtractor);

        addF.get(); //Constantly checkking on the task, is it over?
        addS.get();

        System.out.println("Value count : " + v.count);
    }
}
