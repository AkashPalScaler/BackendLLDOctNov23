package NumberPrinterThread;

public class Client {
    public static void main(String[] args) {
        //0-100 numbers but each number should be printed by a new thread
        for(int i = 0;i<=100;i++){
            Runnable np = new NumberPrinter(i); // Creating a new task with a new number
            Thread t = new Thread(np);
            t.start();
        }
    }
}
