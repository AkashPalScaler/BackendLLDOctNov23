package AdderSubtractorSynchronised;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    Value v;
    Test t;

    public Subtractor(Value v, Test t){
        this.v = v;
        this.t = t;
    }
    @Override
    public Void call() throws Exception {
        for(int i=1;i<=10000;i++){
            synchronized (v){ //Synchronisation
                v.count = v.count - i;
            }
        }
        return null;
    }
}
