package LambdaAndStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numList = List.of(1, 5,2,3,7,6,10, 1, 8,8, 10);

//        Consumer<Integer> print = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
//        numList.stream().forEach((elem) -> System.out.println(elem));

//        numList
//                .stream()
//                .limit(4)
//                .distinct()
//                .forEach((elem) -> System.out.println(elem));

        //Filter, Map, Reduce
        //Filter
        List<Integer> list1 = numList.stream()
                .filter((elem) ->  {
                    return elem%2 == 0;
                })
                .collect(Collectors.toList()); // Terminal method

        System.out.println("New list:  " + list1);

        //Map

        List<Integer> list2= numList.stream()
                .map((elem) ->{
                    return elem*elem;
                })
                .collect(Collectors.toList());

        System.out.println("New list:  " + list2);

        List<Integer> list3= numList.stream()
                .filter((elem) ->  {
                    System.out.println("Filtering "+elem);
                    return elem%2 == 0;
                })
                .map((elem) ->{
                    System.out.println("Mapping "+elem);
                    return elem*elem;
                })
                .collect(Collectors.toList());

        System.out.println("New list:  " + list3);

        //1, 5,2,3,7,6,10, 1, 3,3, 10
        Optional<Integer> i = numList.stream()
                .filter((elem) ->  {
                    System.out.println("Filtering "+elem);
                    return elem%2 == 0;
                })
                .map((elem) ->{
                    System.out.println("Mapping "+elem);
                    return elem*elem;
                })
                .findFirst();

        if(!i.isEmpty()){
            System.out.println(i.get());
        }


        //Reduce
        int sum = 0;
        for(Integer a: numList){
            sum = sum + a;
        }
        System.out.println(sum);

        Integer newSum = numList.stream()
                .reduce(10, (curr_sum, elem) -> {
                   return curr_sum + elem;
                });

        System.out.println("Sum :"+newSum);

        Integer fact = numList.stream()
                .reduce(1, (curr_sum, elem) -> {
                    return curr_sum * elem;
                });

    }

}
