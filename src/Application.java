interface Animal {
    void sound();

    default void sleep() {
        System.out.println("Zwierze idzie spac");
    }

    static void endOfDay() {
        System.out.println("Dzien się skonczyl, zwierzeta ida spac");
    }
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Woof Woof!");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Meow Meow!");
    }
}

public class Application {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        d1.sound();
        c1.sound();

        d1.sleep();
        c1.sleep();

        Animal.endOfDay();
    }
}