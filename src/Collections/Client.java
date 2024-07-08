package Collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        //Underlying Structure -> Array
        //Insertion : Amortized O(1)/Random Read : O(1)
        // Is it dynamically resizable? Can it grow: Yes
       List<Integer> list1 = new ArrayList<>();

       //Underlying Structure -> LinkedList
        // Insertion at read/end or next to given node: O(1) //Random read: O(n)
        // Too many insertions(Not amortized) and deletions(Middle) we prefer linkedlist
        // Memory usage is more - > each node keeps pointer infos
       List<Integer> list2 = new LinkedList<>();

       // Deprecated
        //Underlying structure -> Array
        // Thread safe
       List<Integer> list3 = new Vector<>();


        //Thread safe - synchronized
        //Mehtods restricted to push, pop, peek
       List<Integer> list4 = new Stack<>();


       //Queue

        //Underlying structure: LinkedList
        //If follows: FIFO (insertion order)
        //Queue is used for making items wait to be processed
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(4);
        q1.add(1);
        q1.add(9);

        //PriorityQueue
        //Underlying structure : Balanced Heap
        Queue<Integer> q2 = new PriorityQueue<>();
        q2.add(4);
        q2.add(1);
        q2.add(9);

//        System.out.println("Linked list q : "+ q1);
//        System.out.println("Priority q : "+ q2);

        //ArrayDeque
        // Underlying structure : Array(Resizable)
        // Keeps items in insertion order
        Queue<Integer> q3 = new ArrayDeque<>();

        //Sets
        //Underlying structure: HashMap
        //Natural number Ordered : Ascending
        //Not thread safe
        Set<Integer> set1 =  new HashSet<>();
        set1.add(5);
        set1.add(2);
        set1.add(4);
        set1.add(9);

        //Underlying Structure: DLL + HashMap
        //Insertion order
        //Not thread safe
        Set<Integer> set2 =  new LinkedHashSet<>();

        set2.add(5);
        set2.add(2);
        set2.add(4);
        set2.add(9);

        //Underlying Structure: Balance binary tree :  Red black Tree
       // Natural number Ordered : Ascending
        //Not thread safe
        Set<Integer> set3 =  new TreeSet<>();

        set3.add(5);
        set3.add(2);
        set3.add(4);
        set3.add(9);

//        System.out.println("Hashset : " + set1);
//        System.out.println("LinkedHashset : " + set2);
//        System.out.println("Treeset : " + set3);

       //ConcurrentHashSet -> Modify the concurrentHashMap


     //HashMap
     //Underlying structure: HashMap
     //Natural number Ordered : Ascending
     Map<Integer, Integer> map1 = new HashMap<>();

     //Underlying Structure: DLL + HashMap
     //Insertion order
     //Not thread safe
     Map<Integer, Integer> map2 = new LinkedHashMap<>();

     //Underlying Structure: Balance binary tree :  Red black Tree
     // Natural number Ordered : Ascending
     //Not thread safe
     Map<Integer, Integer> map3 = new TreeMap<>();

     map1.put(5, 5);
     map1.put(3, 3);
     map1.put(6, 9);
     map1.put(1, 10);

     map2.put(5, 5);
     map2.put(3, 3);
     map2.put(6, 9);
     map2.put(1, 10);

     map3.put(5, 5);
     map3.put(3, 3);
     map3.put(6, 9);
     map3.put(1, 10);


     System.out.println("HashMap : "+ map1);
     System.out.println("LinkedHashMap : "+ map2);
     System.out.println("TreeMap : "+ map3);

     Hashtable

    }
}
