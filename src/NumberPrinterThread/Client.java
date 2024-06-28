package NumberPrinterThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        //0-100 numbers but each number should be printed by a new thread
//       Traditional way of creating threaDS
//        for(int i = 0;i<=1000000;i++){
//            Runnable np = new NumberPrinter(i); // Creating a new task with a new number
//            Thread t = new Thread(np);
//            t.start();
//        }

        //CREATING THREADS USING EXECUTORS
        //Executor is our thread manager
        //Manage, create, and assign tasks to threads
        ExecutorService es = Executors.newFixedThreadPool(16);

        for(int i = 0;i<=1000000;i++){
            if(i == 100){
                System.out.println("DEBUG");
            }
            Runnable np = new NumberPrinter(i); // Creating a new task with a new number
            es.execute(np);
        }

        ExecutorService es1 = Executors.newCachedThreadPool();

        for(int i = 0;i<=1000000;i++){
            if(i == 1000){
                System.out.println("DEBUG");
            }
            Runnable np = new NumberPrinter(i); // Creating a new task with a new number
            es1.execute(np);
        }
    }
}
