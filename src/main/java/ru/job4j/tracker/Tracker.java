package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] find = new Item[items.length];
        size = 0;
        for(int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                find[size] = items[i];
                size++;
            }
            find = Arrays.copyOf(find, size);
        }
        return find;
    }

    public Item findByName(String key) {
        Item name = null;
        for (int i = 0; i < items.length; i++){
            Item item = items[i];
            if(item.getName() == key){
                name = item;
                break;
            }
        }
        return name;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if(index != -1){
            item.setId(items[index].getId());
            items[index] = item;
            return true;
        }else {
            return false;
        }
    }
}