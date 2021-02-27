package ru.job4j.oop;

public class Cat {

    private  String food;
    private String name;

    public void giveNick(String nick){
        this.name = nick;
    }

    public void show() {
        System.out.println(this.name + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("gav ");
        gav.show();
        gav.eat("kotleta");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("black ");
        black.show();
    }
}
