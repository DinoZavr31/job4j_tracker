package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static int max(int left, int right, int top){
        return max(left, max(right, top));
    }

    public static int max(int left, int right, int top, int bottom){
        return max(left, max(right, top, bottom));
    }
}

