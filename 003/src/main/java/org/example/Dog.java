package org.example;

public class Dog extends Animal implements Swimmable {
    private static int count = 0;

    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwim) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м. (максимум " + maxSwim + " м.)");
        }
    }
}