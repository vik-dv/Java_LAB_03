package org.example;

public class Cat extends Animal {
    private static int count = 0;

    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        count++;
    }

    public static int getCount() {
        return count;
    }
}