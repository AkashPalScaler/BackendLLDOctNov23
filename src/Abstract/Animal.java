package Abstract;

public abstract class Animal {
    String type;
    int weight;

    void checkDeadORAlive(){
        System.out.println("Checking dead or alive!");
    }

    abstract void move();
}
