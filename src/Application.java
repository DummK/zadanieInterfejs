interface Animal {
    void sound();

    default void sleep() {
        System.out.println("Zwierze idzie spac");
    }

    default void eat() {
        System.out.println("Zwierze zaczyna jesc");
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

class Bird implements Animal {
    public void sound() {
        System.out.println("Tweet Tweet!");
    }
}

class Cow implements Animal {
    public void sound() {
        System.out.println("Moo Moo!");
    }
}


public class Application {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat cat1 = new Cat();
        Bird b1 = new Bird();
        Cow cow2 = new Cow();
        System.out.println("---------");
            d1.sound();
            cat1.sound();
        System.out.println("---------");
            d1.sleep();
            cat1.sleep();
        System.out.println("---------");
            b1.sound();
            cow2.sound();
        System.out.println("---------");
            b1.sleep();
            cow2.sleep();
        System.out.println("---------");
            d1.eat();
            cat1.eat();
            b1.eat();
            cow2.eat();
        System.out.println("---------");

        Animal.endOfDay();
    }
}