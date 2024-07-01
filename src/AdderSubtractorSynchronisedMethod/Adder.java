package AdderSubtractorSynchronisedMethod;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    Value v;

    public Adder(Value v){
        this.v = v;
    }
    @Override
    public Void call() throws Exception {
        for(int i=1;i<=10000;i++){
//            v.count = v.count + i;
            v.increment(i);
        }
        return null;
    }
}
