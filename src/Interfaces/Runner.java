package Interfaces;

public interface Runner {

    int x = 10; //Static, final
    void run();
    void rehydrate();

    default void rest(){
        System.out.println("Runner taking rest");
    }
}
