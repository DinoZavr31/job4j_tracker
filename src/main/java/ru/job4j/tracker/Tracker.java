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
        return Arrays.copyOf(find, size);
    }

    public Item[] findByName(String key) {
        Item[] name = new Item[items.length];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Item names = items[i];
            if (names.getName().equals(key)) {
                name[count] = names;
                count++;
            }
        }
        return Arrays.copyOf(name, count);
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
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            return true;
        }
            return false;
    }

    public boolean delete(int id) {
        boolean result = false;
        int index = indexOf(id);

        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
            result = true;
        }
        return result;
    }
}