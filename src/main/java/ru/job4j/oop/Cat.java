package ru.job4j.oop;

public class Cat {

    private  String food;
    private String name;

    public void giveNick(String nick){

    }

    public void show() {
        System.out.println(this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.show();
        gav.eat("kotleta");
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.show();

    }
}
