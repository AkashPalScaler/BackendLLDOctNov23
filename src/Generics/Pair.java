package Generics;

public class Pair <T, S>{
    T first;
    S second;

    T getFirst(){
        return first;
    }

    void setFirst(T first){
        this.first = first;
    }

    S getSecond(){
        return second;
    }

    void setSecond(S second){
        this.second = second;
    }

    public static <V, S> S check(V third, S fourth){
       return fourth;
    }

    public static <V> V check1(V third, V fourth){
        return fourth;
    }

    public <F> F check2(F fifth, T something){
        return fifth;
    }

}
