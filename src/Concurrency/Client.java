package Concurrency;

public class Client {
    public static void main(String[] args) {
        //1st way
        Runnable helloWorldObject = new HelloWorldPrinter();
        System.out.println(Thread.currentThread().getName());
        helloWorldObject.run();
        Runnable hs = new HelloScaler();
        Thread t = new Thread(hs);
        t.start(); //Under the cover it will run the method run() of helloWorldPrinter in the newly cfreated thread


        //Another Way doing this
        Thread t1 = new AnotherWayPrinter(); //Parent reference can hold child
        t1.start();

    }
}
