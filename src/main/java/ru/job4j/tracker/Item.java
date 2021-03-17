package ru.job4j.tracker;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Item {
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();

    public Item() {}
    public Item(int id) {}
    public Item(int id, String name) {}

    public LocalDateTime getCreated() {
        return created;
    }

    public static class StartUI {
        public static void main(String[] args) {
            Item item = new Item();
            item.getCreated();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
            String itemFormat = item.getCreated().format(formatter);
            System.out.println(itemFormat);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}