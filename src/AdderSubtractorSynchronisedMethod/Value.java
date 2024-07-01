package AdderSubtractorSynchronisedMethod;

public class Value {
    int count;//Default 0

    synchronized void increment(int i){
        count += i;
    }

    synchronized void decrement(int i){
        count -= i;
    }
}
