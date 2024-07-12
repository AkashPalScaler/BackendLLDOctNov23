package IterableIterator;

import java.util.Iterator;
import java.util.List;

public class Student implements Iterable<Integer>{
    List<Integer> nums;

    public Student(){
        nums = List.of(1,4,6,7,4,7,9);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new CustomIterator(nums);
    }
}
