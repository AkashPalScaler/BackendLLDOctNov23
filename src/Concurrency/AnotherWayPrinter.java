package Concurrency;

public class AnotherWayPrinter extends Thread{
    @Override
    public void run() {
        System.out.println("Another Printer! -> " + Thread.currentThread().getName());
    }
}
