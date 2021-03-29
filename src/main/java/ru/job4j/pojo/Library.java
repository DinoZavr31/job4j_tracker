package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Clean code", 300);
        Book second = new Book("Hard code", 400);
        Book third = new Book("Programmer", 500);
        Book fourth = new Book("Java", 600);
        Book[] lib = new Book[4];
        lib[0] = first;
        lib[1] = second;
        lib[2] = third;
        lib[3] = fourth;
        for (int index = 0; index < lib.length; index++){
            Book coll = lib[index];
            System.out.println(coll.getName() + " - " + coll.getCount());
        }
        System.out.println("Переставьте местами книги с индексом 0 и 3");
        Book i = lib[0];
        lib[0] = lib[3];
        lib[3] = i;
        for (int index = 0; index < lib.length; index++) {
            Book coll = lib[index];
            System.out.println(coll.getName() + " - " + coll.getCount());
        }
        System.out.println("Добавьте цикл с выводом книг с именем Clean code");
        for (int index = 0; index < lib.length; index++) {
            Book coll = lib[index];
            String s = "Clean code";
            if (s.equals(coll.getName())){
                System.out.println(coll.getName());
            }
        }
    }
}
