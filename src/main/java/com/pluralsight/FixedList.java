package com.pluralsight;

import java.util.List;

public class FixedList<T> {
    private List<T> items;
    private int maxSize;

    public FixedList(List<T> items, int maxSize) {
        this.items = items;
        this.maxSize = maxSize;
    }

    public <item> void add(T item){
        items.add(item);
        maxSize++;
    }
    public List<T> getItems(){
        return items;
    }
}
