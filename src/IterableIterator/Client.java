package IterableIterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Akash", 10);
        hm.put("Sam", 11);
        hm.put("Pranay", 12);

        Iterator<Map.Entry<String, Integer>> i = hm.entrySet().iterator();

//        while(i.hasNext()){
//            Map.Entry<String, Integer> entry = i.next();
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

//        List<Integer> ls = List.of(1,2,34);
//        for(Integer elem: ls){
//            System.out.println(elem);
//        }

        Student s = new Student();

        for(Integer elem: s){ // hasNext and next
            System.out.println(elem);
        }
    }
}
