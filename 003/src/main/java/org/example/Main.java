package org.example;

/*
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}*/


public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Cat("Барсик", 200, 0),
                new Dog("Бобик", 500, 10),
                new Cat("Мурка", 250, 0),
                new Dog("Шарик", 400, 15),
                new Cat("Пушок", 180, 0),
                new Dog("Рекс", 600, 5),
                new Cat("Тишка", 220, 0)
        };

        System.out.println("Всего животных: " + Animal.getCount());
        System.out.println("Котов: " + Cat.getCount());
        System.out.println("Собак: " + Dog.getCount());
        System.out.println();

        System.out.println("--- Бег ---");
        for (Animal animal : animals) {
            animal.run(150);
        }

        System.out.println("\n--- Плавание (только умеющие) ---");
        for (Animal animal : animals) {
            if (animal instanceof Swimmable) {
                ((Swimmable) animal).swim(10);
            }
        }
    }
}
