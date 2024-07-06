package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        HashMap hm = new HashMap<>();
        hm.put(1, "Hello");
        hm.put("Hello", 2);
        hm.put("Hello", 2.3);
        Integer i =(Integer) hm.get("Hello");
        //Why is this still allowed? -  Backward Compatibility

//        HashMap hm1 = new HashMap<>();
//        hm1.put("Akash",1);
//        HashMap hm2 = new HashMap<>();
//        hm2.put(2,1);
//        hm1 = hm2;

//        HashMap<String, Double> hm1 = new HashMap<>();
//        hm1.put("Akash", 1.0);
//        HashMap<Integer, Integer> hm2 = new HashMap<>();
//        hm2.put(1, 2);
//
//        Double d = (Double) hm1.get("Akash");

//        Pair<Integer, String> p = new Pair<>();
//        Pair<String, String> p1 = new Pair<>();
//        Pair<Double, String> p2 = new Pair<>();

//        p1.first = "Aakashj";

//        String y = Pair.<String>check("Akash");
//        Integer x = Pair.check(5);

        Pair<Integer, String> p = new Pair<>();

        p.<Float>check2(0.5f, 5);

        System.out.println("Successfull");

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Tommy"));
        animals.add(new Cat("Billy"));

        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("Tom"));
        dogs.add(new Dog("Jerry"));

        List<Cat> cats = new ArrayList<>();

        printAnimalNames(animals);

    }

    public static void printAnimalNames(List<? extends Animal > animalList){
//        animalList.add(new Animal("Akash")); - Not allowed
//        animalList.add(new Cat("Akash")); - Not allowed
        System.out.println(animalList);
    }
}
