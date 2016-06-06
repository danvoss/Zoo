package com.mycompany;

public class Main {

    public static void main(String[] args) {
        Animal d = createAnimal("Do");
        Animal s = createAnimal("Snake");
        Animal h = createAnimal("Hawk");

        //below: an "anonymous class" -- in case we only need the code once, more convenient than creating new
        // inheritance classes

        Animal a = new Reptile() {
            @Override
                public void makeSound() {
                System.out.println("Croak!");
            }
        };
        a.name = "Alligator";

        // anonymous function a.k.a. lambda
        Runnable r = () -> {
            System.out.println("Hello from lambda!");
        };
        r.run();
        sayHello(r);

        d.makeSound();
        s.makeSound();
        h.makeSound();
        a.makeSound();

        System.out.println(d);
        System.out.println(s);
        System.out.println(h);
        System.out.println(a);
    }

    public static Animal createAnimal(String name) {
        switch (name) {
            case "Dog":
                return new Dog();
            case "Snake":
                return new Snake();
            case "Hawk":
                return new Hawk();
        }
        return null;
    }

    public static void sayHello(Runnable runnable) {
        System.out.println("Hello!");
        runnable.run();
    }
}
