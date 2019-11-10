package ru.unn.agile.PriorityQueue.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PriorityQueue<E extends Comparable<? super E>> {
    private ArrayList<E> arr = new ArrayList<E>();

    public PriorityQueue() {
    }

    public boolean isEmpty() {
        return arr.isEmpty();
    }

    public int size() {
        return arr.size();
    }

    public void push(E elem) {
        arr.add(elem);
        arr.sort((a,b) -> b.compareTo(a));
    }

    public E pop() {
        if (isEmpty())  {
            return null;
        }

        var e = arr.get(0);
        arr.remove(0);
        return e;
    }
}
