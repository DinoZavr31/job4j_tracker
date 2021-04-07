package ru.job4j.tracker;

import java.util.Arrays;

public class StartU {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("Rinat");
        item.setId(1);
        tracker.add(item);
        System.out.println(Arrays.toString(tracker.findByName("Rinat")));
        System.out.println(tracker.findById(1));
    }
}
