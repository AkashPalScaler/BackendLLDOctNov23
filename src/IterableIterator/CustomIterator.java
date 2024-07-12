package IterableIterator;

import java.beans.Introspector;
import java.util.Iterator;
import java.util.List;

public class CustomIterator implements Iterator<Integer> {
    int index;
    List<Integer> ls;

    public CustomIterator(List<Integer> ls){
        this.ls = ls;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < ls.size();
    }

    @Override
    public Integer next() {
        return ls.get(index++);
    }
}
